package model;

public class Coche {
    private String marca;
    private  String modelo;
    private int dorsal;
    private double kmRecorridos;
    private int puntosTotales;

    public Coche(String marca, String modelo, int dorsal){
        this.marca = marca;
        this.modelo = modelo;
        this.dorsal= dorsal;
        this.kmRecorridos = 0;
        this.puntosTotales = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public double getKmRecorridos() {
        return kmRecorridos;
    }

    public void setKmRecorridos(double kmRecorridos) {
        this.kmRecorridos = kmRecorridos;
    }

    public int getPuntosTotales() {
        return puntosTotales;
    }

    public void setPuntosTotales(int puntosTotales) {
        this.puntosTotales = puntosTotales;
    }
}
