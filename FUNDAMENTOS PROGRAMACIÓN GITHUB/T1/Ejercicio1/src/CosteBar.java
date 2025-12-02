import java.util.Scanner;
import java.util.Locale;
public class CosteBar {
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); //para pedir el punto decimal en los precios

        System.out.println("Numero de bebidas (entre 0 y 20): ");
        int numBebidas = sc.nextInt();
    }
}

