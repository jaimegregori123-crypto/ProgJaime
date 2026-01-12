package ejercicio2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int[] numeros = new int [10];
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        for (int i = 0; i < numeros.length ; i++) {
            int aleatorio = (int)Math.random()*20;
            numeros[i] = (int) (Math.random()*20)+1;
        }


        do {
            System.out.println("1. Imprimir el array");
            System.out.println("2. Mover a la izquierda");
            System.out.println("3. Mover a la derecha");
            System.out.println("4. Invertir");
            System.out.println("¿Que opcion quieres hacer?");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    for (int item: numeros){
                        System.out.print(item+" ");
                    }
                    System.out.println();
                }
                case 2->{
                    int temporal = numeros[0];
                    for (int i = 0; i < numeros.length-1; i++) {
                        numeros[i] = numeros[i+1];
                    }
                    numeros[numeros.length-1] = temporal;
                }
                case 3->{
                    int temporal = numeros[numeros.length-1];
                    for (int i = numeros.length-1; i > 0; i--) {
                        numeros[i] = numeros[i-1];
                    }
                    numeros[0] = temporal;
                }
                case 4->{
                    for (int i = 0; i < numeros.length/2; i++) {
                        int temp = numeros[i];
                        numeros[i] = numeros[numeros.length-1-i];
                        numeros[numeros.length-1-i] = temp;
                    }
                }
                case 5 ->{
                    for (int i = 0; i < numeros.length-1; i+=2) {
                        int temp = numeros[i];
                        numeros[i] = numeros [i+1];
                        numeros[i+1] = temp;
                    }
                }
            }
        }while (opcion!=6);
    }
}
