import controller.Gestor;
import model.Categoria;
import model.Producto;

public class Main {

    static void main(String[] args) {
        Producto television = new Producto("TV LG", "001L_TEC", 600, Categoria.TECNOLOGICO);
        Producto movil = new Producto("Samsung", "002LG_TEC", 399, Categoria.TECNOLOGICO);
        Gestor gestor = new Gestor();
        gestor.agregarProducto(television);
        gestor.agregarProducto(movil);
        System.out.println(gestor.calcularPrecioMedio());
    }
}
