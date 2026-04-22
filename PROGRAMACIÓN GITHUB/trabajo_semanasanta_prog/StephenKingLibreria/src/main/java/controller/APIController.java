package controller;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import model.Libro;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;

public class APIController {

    // 1. Obtener todos los libros (Opción 1)
    public ArrayList<Libro> obtenerTodosLosLibros() {
        String json = realizarPeticion("https://stephen-king-api.onrender.com/api/books");
        ArrayList<Libro> listaMapeada = new ArrayList<>();

        if (json != null) {
            try {
                Gson gson = new Gson();
                // Analizamos el JSON
                JsonObject objetoCompleto = gson.fromJson(json, JsonObject.class);

                // ¡AQUÍ ESTABA EL FALLO! La clave es "data", no "books"
                JsonArray arrayLibros = objetoCompleto.getAsJsonArray("data");

                if (arrayLibros != null) {
                    listaMapeada = gson.fromJson(arrayLibros, new TypeToken<ArrayList<Libro>>(){}.getType());
                }
            } catch (Exception e) {
                System.out.println("Error al procesar el JSON: " + e.getMessage());
            }
        }
        return listaMapeada;
    }

    // 2. Obtener un libro por ID (Opción 2)
    public Libro obtenerLibroPorId(int id) {
        String json = realizarPeticion("https://stephen-king-api.onrender.com/api/book/" + id);
        if (json != null) {
            try {
                Gson gson = new Gson();
                JsonObject objeto = gson.fromJson(json, JsonObject.class);
                // La API mete el libro individual dentro de "data"
                return gson.fromJson(objeto.get("data"), Libro.class);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    // 3. MÉTODO AUXILIAR PARA LA CONEXIÓN (Este es el que te faltaba)
    private String realizarPeticion(String urlFull) {
        try {
            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(20))
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(urlFull))
                    .header("User-Agent", "Mozilla/5.0")
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.out.println("Error de servidor: " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error crítico de conexión: " + e.getMessage());
            return null;
        }
    }
}
