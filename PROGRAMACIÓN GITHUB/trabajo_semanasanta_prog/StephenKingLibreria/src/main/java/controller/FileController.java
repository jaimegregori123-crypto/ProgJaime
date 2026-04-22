package controller;
import model.Libro;
import java.io.*;
import java.util.ArrayList;

public class FileController {

    private String nombreFichero = "favoritos.obj";

    //metodo para exportar
    public void exportarFavoritos(ArrayList<Libro> lista){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreFichero))){
            oos.writeObject(lista);
            System.out.println("Favoritos exportados correctamente a " + nombreFichero);
        } catch (IOException e){
            System.out.println("Error al exportar: " + e.getMessage());
        }
    }

    //metodo para importar
    public ArrayList<Libro> importarFavoritos() {
        File fichero = new File(nombreFichero);

        if (!fichero.exists()){
            System.out.println("No hay ningun archivo de favoritos previo");
            return new ArrayList<>();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreFichero))){
            return (ArrayList<Libro>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al importar favoritos: " + e.getMessage());
            return new ArrayList<>();
        }

        }
    }


