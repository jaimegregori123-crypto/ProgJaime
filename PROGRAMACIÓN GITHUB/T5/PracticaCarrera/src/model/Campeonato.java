package model;

import java.util.ArrayList;

public class Campeonato {

    private ArrayList<Coche> coches;
    private ArrayList<Carrera> carreras;

    public Campeonato(){
        this.coches = new ArrayList<>();
        this.carreras = new ArrayList<>();
    }

    public void añadirCoche(Coche c){
        this.coches.add(c);
    }

    public void añadirCarrera(Carrera cc){
        this.carreras.add(cc);
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }
}
