package model;

public class CuadradoMagico {

    private int[][] matriz;
    private int tamanio;

    public CuadradoMagico (int n){
        this.tamanio = n;
        this.matriz = new int[n][n];
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getTamanio() {
        return tamanio;
    }
    
    public boolean esMagico() {
        int sumaReferencia = 0;
        for (int j = 0; j < tamanio; j++) {
            sumaReferencia += matriz[0][j];
        }

        for (int i = 0; i < tamanio; i++) {
            int sumaFila = 0;
            for (int j = 0; j < tamanio; j++) {
                sumaFila += matriz[i][j];
            }
            if (sumaFila != sumaReferencia) return false;
        }

        for (int j = 0; j < tamanio; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < tamanio; i++) {
                sumaColumna += matriz[i][j];
            }
            if (sumaColumna != sumaReferencia) return false;
        }

        int sumaDiag1 = 0;
        for (int i = 0; i < tamanio; i++) {
            sumaDiag1 += matriz[i][i];
        }
        if (sumaDiag1 != sumaReferencia) return false;

        int sumaDiag2 = 0;
        for (int i = 0; i < tamanio; i++) {
            sumaDiag2 += matriz[i][tamanio - 1 - i];
        }
        if (sumaDiag2 != sumaReferencia) return false;

        return true;
    }
}
