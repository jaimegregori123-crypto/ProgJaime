package view;

import model.Usuario;
import model.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import java.util.ArrayList;

public class MainApp {
    static void main(String[] args) {
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();

        listaUsuarios.add(new Administrador("Borja", "Martin", "12345678A", "admin@gmail.com", "1234"));
        listaUsuarios.add(new Trabajador("Jaime", "Gregori", "23456789B", "trabajador@gmail.com", "abcd"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BIENVENIDO AL SISTEMA ---");
        System.out.println("Introduce tu correo");
        String correoIntro = scanner.nextLine();
        System.out.println("Introduce tu password");
        String passIntro = scanner.nextLine();


        Usuario usuarioLogueado = null;

        for (Usuario u : listaUsuarios){
            if (u.getCorreo().equals(correoIntro) && u.getPassword().equals(passIntro)){
                usuarioLogueado = u;
                break;
            }
        }

        if (usuarioLogueado != null){
            System.out.println("Loguin correcto. Bienvenido" + usuarioLogueado);
        }else {
            System.out.println("Correo o contraseña incorrectos.");
        }

        if (usuarioLogueado instanceof Administrador){
            abrirMenuAdministrador((Administrador) usuarioLogueado, listaUsuarios, scanner);
        } else if (usuarioLogueado instanceof Trabajador) {
            abrirMenuTrabajador((Trabajador) usuarioLogueado, scanner);
        }


    }

    private static void abrirMenuAdministrador(Administrador admin, ArrayList<Usuario> lista, Scanner scanner){
        int opcion = -1;
        do{
            System.out.println("\n--- MENÚ DE ADMINISTRADOR ---");
            System.out.println("1. Dar de alta a trabajador");
            System.out.println("2. Dar de baja a trabajador");
            System.out.println("3. Ver trabajadores");
            System.out.println("4. Ver registros de jornada");
            System.out.println("0. Salir");
            System.out.println("Selecciona opción");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    darAltaTrabajador(lista, scanner);
                    guardarUsuarios(lista);
                    break;
                case 2:
                   darBajaTrabajador(lista, scanner);
                    break;
                case 3:
                    for (Usuario usuario : lista) {System.out.println(usuario);}
                    break;
                case 4:
                    verRegistrosJornada();
                    break;
                case 0:
                    System.out.println("Saliendo del menu de admin...");
                    break;
            }
        } while (opcion != 0);
    }

    private static void abrirMenuTrabajador(Trabajador trabajador, Scanner scanner){
        int opcion = -1;
        do{
            System.out.println("\n--- MENU TRABAJADOR --- ");
            System.out.println("1. Realizar fichaje");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion){
                case 1:
                    realizarFichaje(trabajador);
                    break;
                case 0:
                    System.out.println("Cerrando sesión...");
                    break;
                default:
                    System.out.println("Opción no valida");
            }
        }while (opcion != 0);
    }

    private static void realizarFichaje(Trabajador trabajador) {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String fechaHora = ahora.format(formato);

        try (FileWriter fw = new FileWriter("horas.txt", true);
             PrintWriter out = new PrintWriter(fw)){

            out.println(trabajador.getCorreo() + " - " + fechaHora);
            System.out.println("Fichaje registrado: " + fechaHora);
        }catch (IOException e) {
            System.out.println("Error al acceder al sistema de fichajes.");
        }
    }

    private static void verRegistrosJornada(){
        File archivo = new File("horas.txt");

        //si el archivo no existe todavia porque nadie ha fichado, avisamos

        if (!archivo.exists()){
            System.out.println("Aún no hay registros de jornada");
            return;
        }

        try (Scanner lector = new Scanner(archivo)) {
            System.out.println("--- LISTADO DE FICHAJES ---");

            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        }catch (IOException e){
            System.out.println("Error al leer los registros.");
        }
    }

    private static void darAltaTrabajador(ArrayList<Usuario> list, Scanner scanner){
        System.out.println("\n---- ALTA DE NUEVO TRABAJADOR ---");

        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.println("DNI: ");
        String dni = scanner.nextLine();

        System.out.println("Correo: ");
        String correo = scanner.nextLine();

        System.out.println("Contraseña");
        String contrasenia = scanner.nextLine();

        Trabajador nuevo = new Trabajador(nombre, apellido, dni, correo, contrasenia);
        list.add(nuevo);

        System.out.println("¡Trabajador " + nombre + " dado de alta correctamente!");
    }

    private static void darBajaTrabajador(ArrayList<Usuario> list, Scanner scanner){
        System.out.println("Introduce el DNI del trabajador a borrar: ");
        String dniABuscar = scanner.nextLine();

        Usuario usuarioABorrar = null;


        for (Usuario usuario : list){
            if (usuario.getDni().equals(dniABuscar)){
                usuarioABorrar  = usuario;
                break;
            }
        }

        if (usuarioABorrar != null){
            list.remove(usuarioABorrar);
            System.out.println("Trabajador eliminado correctamente.");
        }else {
            System.out.println("No se ha encontrado ningun trabajador con ese DNI.");
        }

    }

    private static void guardarUsuarios(ArrayList<Usuario> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("usuarios.dat"))) {
            oos.writeObject(list);
            System.out.println("Datos de usuarios guardados en disco.");
        } catch (IOException e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }
}



