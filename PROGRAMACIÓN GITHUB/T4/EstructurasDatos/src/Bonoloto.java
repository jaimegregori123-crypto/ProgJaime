import java.util.Scanner;

public class Bonoloto {
    private int[] numerosSistema = new int[5];
    private int[] numerosUsuario = new int[5];
    private int aciertos = 0;
    private Scanner scanner = new Scanner(System.in);

    public void iniciarJuego() {
        for (int i = 0; i < 5; i++) {
            numerosSistema[i] = (int) (Math.random() * 21);

        }

        System.out.println("Procedemos a sellar tu boleto");
        for (int i = 0; i < 5; i++) {
            int numeroIntroducido;
            do {
                System.out.println("Introduce el numero con el que quieras jugar");
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido<0 || numeroIntroducido>20){
                    System.out.println("Numero incorrecto");
                }
            }while (numeroIntroducido<0 || numeroIntroducido > 20);
            numerosUsuario[i] = numeroIntroducido;
        }
    }


    public void listarNumerosSistema() {
        System.out.println("Los numeros del sistema son: ");
        for (int item : numerosSistema) {
            System.out.println(item);
        }
    }

    public void listarNumerosUsuario() {
        for (int item : numerosUsuario) {
            System.out.println(item);
        }
    }

    public void buscarNumerosSistema()