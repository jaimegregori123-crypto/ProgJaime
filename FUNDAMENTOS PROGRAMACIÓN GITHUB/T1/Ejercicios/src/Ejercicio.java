import java.util.Scanner;

public class Ejercicio {

     private Scanner lecturaTeclado;

    /*
    Ejercicio 1
    Hágase una aplicación que permita introducir el número de bebidas y bocadillos
    comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada
    bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00
    €). También se podrá introducir el número de alumnos que realizaron la compra
            (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las
            bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno
    redondeada a 2 decimales. (CosteBar)

     */

    // 1. Introducir valores
    // 2. Guardar variables

    public void ejercicio1(){
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos bocatas vais a pedir");
        int numeroBocatas = lecturaTeclado.nextInt();
        System.out.println("Cuantas bebidas vais a pedir");
        int numeroBebidas = lecturaTeclado.nextInt();
        System.out.println("Cuanto cuesta cada bocata");
        double precioBocata = lecturaTeclado.nextDouble();
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        System.out.println("Cuantas personas entran en la cuenta");
        int personas = lecturaTeclado.nextInt();


        // 3. Realizar calculos

        double precioBocatas = numeroBocatas * precioBocata;
        double precioBebidas = numeroBebidas * precioBebida;
        double costeTotal = precioBocatas + precioBebidas;
        double precioPersona = costeTotal/personas;

        // 4. Mostrar datos


        System.out.printf("El precio de los bocatas es %.2f%n", precioBocatas);
        System.out.printf("El precio de las bebidas es %.2f%n", precioBebidas);
        System.out.printf("El coste total es %.2f%n", costeTotal);
        System.out.printf("El precio por persona es %.2f%n", precioPersona);
        lecturaTeclado.close();
        lecturaTeclado = null;




    }

    public void ejercicio4(){
        lecturaTeclado =  new Scanner(System.in);
        //1. pedir datos
        System.out.println("Cuantos segundos quieres pasar a tiempo");
        int segundosTotal = lecturaTeclado.nextInt();
      //2. realizar calculos
        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundos = segundosTotal%60;
      //3. mostrar
        System.out.println("El numero de horas es "+ horas);
        System.out.println("El numero de minutos es "+ minutos);
        System.out.println("El numero de segundos es "+ segundos);

        lecturaTeclado.close();
        lecturaTeclado = null;

    }

    public void ejercicio2() {

        //1. Pedir datos
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Valor de la compra con IVA (entre 0.00 y 500.00€):");
        double compraConIva = lecturaTeclado.nextDouble();

        System.out.println("Porcentaje de IVA (valor entero entre 0 y 25):");
        int porcentajeIVA = lecturaTeclado.nextInt();

        //2 realizar calculos
        double factorIVA = 1.0 + (double) porcentajeIVA / 100.0;

        double compraSinIVA = compraConIva / factorIVA;

        double ivaPagado = compraConIva - compraSinIVA;

        //3 mostrar

        System.out.printf("----------------------------------------%n"); // Línea separadora con salto de línea (%n)
        System.out.printf("Compra: %.2f €%n", compraSinIVA);             // Muestra la compra sin IVA, formateada
        System.out.printf("IVA: %.2f €%n", ivaPagado);// Muestra el IVA pagado, formateado

        lecturaTeclado.close();
        lecturaTeclado = null;


    }

    public void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un numero de 5 digitos");
        int numeroAnalizar = scanner.nextInt();
        if (numeroAnalizar>9999 && numeroAnalizar<100000){

            int decenasMil = numeroAnalizar/10000;
            int unidadesMil = (numeroAnalizar%10000)/1000;
            int centenas = ((numeroAnalizar%10000)%1000)/100;
            int decenas = (((numeroAnalizar%10000)%1000)%100)/10;
            int unidades = (((numeroAnalizar%10000)%1000)%100)%10;

        } else {
            System.out.println("Numero incorrecto");
        }

        String numeroPalabra = String.valueOf(numeroAnalizar);
        char decenasMil = numeroPalabra.charAt(0);
        char unidadesMil = numeroPalabra.charAt(1);
        char centenas = numeroPalabra.charAt(2);
        char decenas = numeroPalabra.charAt(3);
        char unidades = numeroPalabra.charAt(4);

        System.out.println("Decenas de mil: " + decenasMil);
        System.out.println("Unidades de mil: " + unidadesMil);
        System.out.println("Centenas : " + centenas);
        System.out.println("Decenas : " + decenas);
        System.out.println("unidades : " + unidades);



    }


    }


