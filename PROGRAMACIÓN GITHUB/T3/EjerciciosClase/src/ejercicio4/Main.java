package ejercicio4;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        //puntuacionJ1D = 301
        //puntuacionJ1D = 301

        /*
        // for -> 3 tiradas
           aleatorio entre 0 60 -> restando a cada jugador
           // si en una tirada un  jugador va a quedarse en negativo, no se resta
        mientras uno de los dos jugadores no haya llegado a 0, el juego continua
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del jugador nº1");
        String jugador1 = scanner.nextLine();
        System.out.println("Nombre del jugador nº2");
        String jugador2 = scanner.nextLine();
        int puntos = 301;
        int puntosTurno = 0;
        int resultado = puntos - puntosTurno;

        for (int i = 0; i < 3; i++) {
            int dardo = (int)(Math.random()*61);
            puntosTurno += dardo;
            System.out.println("Puntos del turno: " + puntosTurno);
        }

        if (resultado < 0) {
            System.out.println("Te pasaste, no se resta nada este turno");
        } else {
            puntos = resultado;
            System.out.println("Nueva puntuación: "+puntos);
        }


    }
}
