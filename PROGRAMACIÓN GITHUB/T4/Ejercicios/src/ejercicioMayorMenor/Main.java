package ejercicioMayorMenor;

public class Main {

    static void main(String[] args) {
        int[] numeros = {15, 8, 23, 4, 19, 12};
        int max = numeros[0], min = numeros[0];
        for (int item : numeros){
            if (item > max){
                max = item;
            }
            if (item< min){
                min = item;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
