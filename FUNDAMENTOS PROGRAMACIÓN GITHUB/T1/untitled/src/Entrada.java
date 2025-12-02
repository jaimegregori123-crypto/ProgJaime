import java.util.Scanner;

public class Entrada {

    public static void main(String [] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a relaizar llamadas a metodos");
        //saludar("Borja");
        //saludar("Laura");
        despedir();
        //Operaciones.sumar(4,4);
        int numero;
        Calculadora operacionesMatematicas = new Calculadora() ;
        //operacionesMatematicas.sumar(1,4);
        //operacionesMatematicas.restar(8,2);
        //operacionesMatematicas.restar(8,5);
        //operacionesMatematicas.sumar(8,9);
        //System.out.println(operacionesMatematicas.multiplicar(7,3)*4);
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que numero quieres validar?");
        int numeroValidar = lectorTeclado.nextInt();
        System.out.println("El numero que se intenta validar tiene como resultado: " + operacionesMatematicas.validarNumero(numeroValidar));

    }


    public static void saludar(String nombre){
        System.out.println("Hola " + nombre);
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodos");
        System.out.println("Animo, no decaigas en tu tarea");


    }

    public static void despedir(){
        System.out.println("A cerrar el portatil, a pasar la tarde a casa");

    }
}
