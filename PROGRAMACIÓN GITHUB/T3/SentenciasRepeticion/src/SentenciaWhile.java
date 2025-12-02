import java.util.Scanner;

public class SentenciaWhile {
    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int aleatorio = (int)(Math.random() *11);
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();
        intentos++;

        while (aleatorio!=numero){
            System.out.println("Intento fallido, por favor intentalo de nuevo");
            numero = scanner.nextInt();
            intentos++;

        }
        System.out.printf("Numero acertado en %d intentos", intentos);

    }

    public void imprimirMenu(){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        do {
            System.out.println("Ejecutando sentencia repetitiva con do-while");
            System.out.println("Introduce el numero nuevamente");
            numero = scanner.nextInt();
        }while (numero==0);

        System.out.println("Finalizando la repeticion");
    }
}
