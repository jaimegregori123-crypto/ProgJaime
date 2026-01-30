import controller.Centralita;
import model.Llamada;
import model.LlamadaLocal;
import model.LlamadaNacional;
import model.LlamadaProvincial;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Centralita centralita = new Centralita();
        int opcion = -1;
        do {
            System.out.println("1. Añadir llamada");
            System.out.println("2. Listar llamada");
            System.out.println("3. Mostrar llamada");
            System.out.println("Dime que opcion quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1 -> {
                    Llamada llamada;
                    System.out.println("Que tipo de llamada quieres agregar? \n1. Local\n2. Provincial\n3. Nacional");
                    int tipo = scanner.nextInt();
                    System.out.println("Indica nOrigen");
                    long nOrigen = scanner.nextLong();
                    System.out.println("Indica nDestino");
                    long nDestino = scanner.nextLong();
                    System.out.println("Indica duracion");
                    int duracion = scanner.nextInt();
                    if (tipo==3){
                        System.out.println("Indica la franja");
                        int franja = scanner.nextInt();
                        llamada = new LlamadaNacional(nOrigen, nDestino, duracion, franja);
                    } else if (tipo==2) {
                        llamada = new LlamadaProvincial(nOrigen, nDestino, duracion);
                    }else {
                        llamada = new LlamadaLocal(nOrigen, nDestino, duracion);
                    }
                    centralita.registrarLlamada(llamada);
                    System.out.println("Llamada registrada con exito");
                }
                case 2 -> {
                    centralita.mostrarLlamadas();
                }
                case 3 -> {
                    System.out.println(centralita.getCaja());
                }
                case 4 -> {
                    System.out.println("Saliendo...");
                }
                default -> {
                    System.out.println("Caso no contemplado");
                }
            }
        }while (opcion!=4);

    }
}
