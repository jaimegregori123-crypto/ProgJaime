package ejercicio1;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tienen las matrices");
        int tamanio = scanner.nextInt();
        int[][] matriz1 = new int[tamanio][tamanio];
        int[][] matriz2 = new int[tamanio][tamanio];
        int [][] sumaMatrices = new int[tamanio][tamanio];
        System.out.println("Impriminedo matriz 1");
        ImprimirArray(matriz1);
        System.out.println("Impriminedo matriz 2");
        ImprimirArray(matriz2);
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz2 [i][j] = (int) (Math.random()*51);
                matriz1 [i][j] = (int) (Math.random()*51);
                sumaMatrices [i][j] = matriz1[i][j]+ matriz2[i][j];
            }

        }
        System.out.println("Imprimiendo suma");
        ImprimirArray(sumaMatrices);
    }

    public static void ImprimirArray(int[][] matriz) {
        for (int[] fila: matriz){
            for (int item: fila){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}
