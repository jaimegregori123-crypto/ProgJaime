package model;

public class Coche {

    private String bastidor, matricula, color, marca, modelo;

    private int cv, velocidad;

    private double precio;

    private boolean usado;

    //por defecto en toda clase hay un constructor que se denomina constructor vacio

    public Coche(){}

    public  Coche(String marca, String modelo, String bastidor, String color, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.bastidor = bastidor;
        this.color = color;
        this.cv = cv;

    }

    public Coche(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public Coche(String marca, String modelo, double precio, int cv){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cv = cv;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getBastidor() {
        return bastidor;
    }

    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }

    public int getCv(){
        return this.cv;
    }
    public void setCv(int cv){
        //si el coche al cambiar los cv se pasa de 1000cv, se quedara con 1000, es el tope
        this.cv +=cv;
    }

}


