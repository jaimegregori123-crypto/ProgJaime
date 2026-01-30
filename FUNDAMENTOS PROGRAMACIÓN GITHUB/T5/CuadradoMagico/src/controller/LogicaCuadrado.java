package controller;

import model.CuadradoMagico;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LogicaCuadrado {

    private int intentos = 0;

    public CuadradoMagico buscarCuadrado (int n ){
        CuadradoMagico cuadrado = new CuadradoMagico(n);
        boolean encontrado = false;

        while (!encontrado){
            intentos++;
            int[][] matrizAleatoria = generarMatrizAleatoria(n);
            cuadrado.setMatriz(matrizAleatoria);
            if (cuadrado.esMagico()){
                encontrado = true;
            }
        }return cuadrado;
    }
    private int[][] generarMatrizAleatoria(int n){
        List<Integer> numeros = new ArrayList<>();
        for (int i = 1; i <= n * n; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);

        int [][] matriz = new int[n][n];
        int contador = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = numeros.get(contador);
                contador++;
            }
        }return matriz;

    }public int getIntentos(){
        return intentos;
    }
}
