public class Sudoku {

    private  int[][] cuadrado = new int[4][4];

    public void iniciarCuadrado() {
        System.out.println("Procedemos a iniciar el sudoku");
        rellenarCuadrado();
        mostrarNumeros();
    }

    public void rellenarCuadrado(){
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*20)+1;
                }while (estaNumero(aleatorio));

                cuadrado[i][j] = aleatorio;

            }
        }
    }

    private boolean estaNumero(int numero){
        for (int[] fila:cuadrado) {
            for (  int item : fila) {
                if (item == numero){
                    return true;
                }
            }
        }
        return false;
    }
    public void mostrarNumeros(){
        for (int[]fila : cuadrado) {
            for (int item: fila) {
                System.out.printf("%d\t",item);
            }
            System.out.println();
        }
    }
}
