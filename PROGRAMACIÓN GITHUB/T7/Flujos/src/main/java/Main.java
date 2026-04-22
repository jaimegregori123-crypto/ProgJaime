import controller.GestorFicheros;

public class Main {
    static void main(String[] args) {
        GestorFicheros gestor = new GestorFicheros();
        //gestor.crearFichero("src/main/java/recursos/escritura.txt");
        //gestor.crearCarpeta("src/main/java/recursos/ejemplo");
        gestor.lectorLineas("src/main/java/recursos/lectura.txt");
    }
}
