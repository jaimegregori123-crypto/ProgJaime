package model;

import java.util.ArrayList;

public class Carrera {

    private int kmTotales;
    private ArrayList<Coche> listaCoches;

    public Carrera(int kmTotales){
        this.kmTotales = kmTotales;
        this.listaCoches = new ArrayList<>();
    }

    public void añadirCoche(Coche coche){
        listaCoches.add(coche);
    }

    public int getKmTotales(){
        return kmTotales;
    }

    public ArrayList<Coche> getListaCoches() {
        return listaCoches;
    }
}
