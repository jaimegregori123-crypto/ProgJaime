package model;

import java.io.Serializable;
import java.util.ArrayList;


public class Biblioteca implements Serializable {

    private ArrayList<Libro> listaLibros;

    // inicializa la lista para evitar errores de puntero nulo
    public Biblioteca(){
        this.listaLibros = new ArrayList<>();
    }

    //metodos acceso


    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString(){
        return "Biblioteca con " + listaLibros.size() + " libros";
    }
}
