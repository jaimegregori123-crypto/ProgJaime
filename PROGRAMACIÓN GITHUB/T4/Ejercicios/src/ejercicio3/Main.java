package ejercicio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[]notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.println("Indicame la nota del alumno");
                nota = scanner.nextInt();
                if (nota < 0 || nota > 10){
                    System.out.println("La nota es invalida");
                }
            }while (nota<0.0 || nota>10.0);
            notas [i] = nota;

        }

       int suspensos=0, aprobados=0;
        double media = 0, acumulador=0;
        for (double item:notas){
            if (item<5){
                suspensos++;
            } else {
                aprobados++;
            }
            acumulador+=item;
        }
        System.out.println("suspensos = "+ suspensos);
        System.out.println("aprobados = "+ aprobados);
        System.out.println("media = "+ acumulador/notas.length);
    }
}
