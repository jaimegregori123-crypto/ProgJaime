package main;

import controller.LogicaCuadrado;
import model.CuadradoMagico;
import java.util.Scanner;

public class Entrada {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicaCuadrado controlador = new LogicaCuadrado();

        System.out.println("--- GENERADOR DE CUADRADO MÁGICO ---");

        System.out.println("Introduce el tamaño de la matriz (n): ");
        int n = scanner.nextInt();

        System.out.println("Buscando... Esto puede tardar unos segundos");
        CuadradoMagico resultado = controlador.buscarCuadrado(n);

        System.out.println("\n=== CUADRADO MÁGICO ENCONTRADO ===");
        imprimirMatriz(resultado.getMatriz(), n);

        int constanteMagica = 0;
        for (int j = 0; j < n; j++) {
            constanteMagica += resultado.getMatriz()[0][j];
        }
        System.out.println("Constante mágica: " +constanteMagica);
        System.out.println("Intentos realizados: "+ controlador.getIntentos());
    }
    private static void imprimirMatriz(int[][] matriz, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

