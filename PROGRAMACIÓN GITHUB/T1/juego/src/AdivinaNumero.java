import java.util.Random;
import java.util.Scanner;

void main() {
    Random random = new Random();
    int numeroSecreto = random.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);
    int intento;
    int contador = 0;

    System.out.println("🎯 ¡Adivina el número entre 1 y 100!");

    do {
        System.out.print("Tu intento: ");
        intento = scanner.nextInt();
        contador++;

        if (intento < numeroSecreto) {
            System.out.println("Más alto 🔼");
        } else if (intento > numeroSecreto) {
            System.out.println("Más bajo 🔽");
        } else {
            System.out.println("🎉 ¡Correcto! Lo adivinaste en " + contador + " intentos.");
        }
    } while (intento != numeroSecreto);
}