package controller;

import model.Producto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;

public class Gestor {
    private List<Producto> productos;

    public Gestor(){
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
       boolean existe = productos.stream().anyMatch(item->item.getCodigo().equalsIgnoreCase(p.getCodigo()));
    if (existe){
        System.out.println("Codigo ya usado, no se puede agregar");
    } else {
        productos.add(p);
        System.out.println("producto agregado correctamente");
    }
    }

    public void asignarPrecios(){
        productos.stream()
                .filter(item->item.getPrecio()<0);
                productos.forEach(item->item.setPrecio(Math.random()*100+1));

    }

    public void mostrarProductos(){
        productos.forEach(Producto::mostrarDatos);
    }

    public double calcularPrecioMedio(){
        return productos.stream().mapToDouble(Producto::getPrecio).average().orElse(0.0);
    }

    public long getNumeroProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).count();
    }

    public List<Producto> getListaProductosCaros(double limite){
        return productos.stream().filter(item->item.getPrecio()>=limite).toList();
    }

    public Optional<Producto> buscarPorCodigo(String codigo){
        return productos.stream()
                .filter(item->item.getCodigo().equalsIgnoreCase(codigo))
                .findFirst()
    }

    public void ordenarProductos(){
        productos.sort(Comparator.comparingDouble(Producto::getPrecio).reversed());
    }

    public List<Producto> getProductosPorCondicion(BiPredicate<Producto, Double> condicion, double valor){
        return productos.stream().filter(item-> condicion.test(item, valor)).toList();
    }

}
