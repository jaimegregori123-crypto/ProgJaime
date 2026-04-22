package view;

import controller.APIController;
import controller.BibliotecaController;
import controller.FileController;
import model.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        APIController api = new APIController();
        BibliotecaController gestor = new BibliotecaController();

        int opcion = 0;

        do {
            System.out.println("\n-- BIBLIOTECA STEPHEN KING ---");
            System.out.println("1. Importar catálogo (API completa)");
            System.out.println("2. Buscar libro específico (API por ID)");
            System.out.println("3. Añadir libro a favoritos");
            System.out.println("4. Exportar favoritos a fichero (.obj)");
            System.out.println("5. Importar favoritos desde fichero");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    // llamada a la API y pasamos resultado al gestor
                    gestor.cargarLibros(api.obtenerTodosLosLibros());
                    break;

                case 2:
                    System.out.println("Introduce el ID del libro a buscar en la API: ");
                    int id = scanner.nextInt();
                    Libro l = api.obtenerLibroPorId(id); // <--- Nueva llamada
                    if (l != null) {
                        System.out.println("Resultado: " + l);
                    } else {
                        System.out.println("No se ha encontrado ese libro en el servidor.");
                    }
                    break;

                case 3:
                    // gestion de favoritos, anadir por Id
                    System.out.println("Introduce el ID para favoritos: ");
                    int idFav = scanner.nextInt();
                    gestor.anadirAFavoritos(idFav);

                case 4:
                    // exportar favoritos a favoritos.obj
                    System.out.println("Exportando favoritos a archivo...");
                    FileController fileCtrlOut = new FileController();
                    fileCtrlOut.exportarFavoritos(gestor.getListaFavoritos());
                    break;

                case 5:
                    //importar favoritos desde el archivo local
                    System.out.println("Cargando favoritos desde el archivo...");
                    FileController fileCtrlIn = new FileController();
                    ArrayList<Libro> recuperados = fileCtrlIn.importarFavoritos();

                    if (recuperados.isEmpty()){
                        System.out.println("No se encontraron favoritos guardados.");
                    } else {
                        System.out.println("--- LIBROS FAVORITOS GUARDADOS ---");
                    } for (Libro fav : recuperados){
                    System.out.println(fav);
                }
                    break;

                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }while (opcion != 0);
    }
}
