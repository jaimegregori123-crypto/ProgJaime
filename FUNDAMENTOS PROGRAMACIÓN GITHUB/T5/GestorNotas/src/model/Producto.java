package model;

public class Producto {

    private String nombre, codigo;

     private double precio;

     private Categoria categoria;

    public Producto(){}

    public Producto(String nombre, String codigo, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
    }

    public void mostrarDatos(){
        System.out.println("nombre = " + nombre);
        System.out.println("codigo = " + codigo);
        System.out.println("precio = " + precio);
        System.out.println("categoria.getDescripcion() = " + categoria.getDescripcion());
    }

    public Producto(Categoria categoria, String codigo, String nombre) {
        this.categoria = categoria;
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = -1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
