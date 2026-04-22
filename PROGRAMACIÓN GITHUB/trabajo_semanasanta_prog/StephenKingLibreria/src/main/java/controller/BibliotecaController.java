package controller;

import model.Biblioteca;
import model.Libro;
import java.util.ArrayList;

public class BibliotecaController {

    private Biblioteca miBiblioteca;
    private ArrayList<Libro> listaFavoritos;

    public BibliotecaController() {
        // Inicializamos los objetos para evitar el NullPointerException
        this.miBiblioteca = new Biblioteca();
        this.listaFavoritos = new ArrayList<>();
    }

    // OPCIÓN 1: Carga los libros que vienen de la API en el objeto Biblioteca
    public void cargarLibros(ArrayList<Libro> librosNuevos) {
        if (librosNuevos != null && !librosNuevos.isEmpty()) {
            this.miBiblioteca.setListaLibros(librosNuevos);
            System.out.println("Biblioteca actualizada con éxito.");
            System.out.println("Total de libros disponibles: " + miBiblioteca.getListaLibros().size());
        } else {
            System.out.println("No se han podido cargar libros (la lista está vacía o es nula).");
        }
    }

    // MÉTODO AUXILIAR: Busca un libro por su ID dentro de la biblioteca cargada
    public Libro buscarPorId(int id) {
        if (miBiblioteca.getListaLibros() != null) {
            for (Libro l : miBiblioteca.getListaLibros()) {
                if (l.getId() == id) {
                    return l;
                }
            }
        }
        return null;
    }

    // OPCIÓN 3: Añade un libro de la biblioteca a la lista de favoritos
    public void anadirAFavoritos(int id) {
        Libro encontrado = buscarPorId(id);
        if (encontrado != null) {
            this.listaFavoritos.add(encontrado);
            System.out.println("El libro '" + encontrado.getTitle() + "' ha sido añadido a favoritos.");
        } else {
            System.out.println("Error: No existe el libro con ID " + id + " en la biblioteca local.");
            System.out.println("Asegúrate de haber importado el catálogo (Opción 1) primero.");
        }
    }

    // Getter para que el FileController pueda obtener la lista y guardarla
    public ArrayList<Libro> getListaFavoritos() {
        return listaFavoritos;
    }
}