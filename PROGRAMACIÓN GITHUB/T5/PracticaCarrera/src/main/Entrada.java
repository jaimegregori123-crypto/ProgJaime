package main;

import java.util.Collections;
import java.util.Comparator;
import controller.CampeonatoController;
import controller.CarreraController;
import model.Campeonato;
import model.Carrera;
import model.Coche;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Campeonato campeonato = new Campeonato();
        CampeonatoController controlador = new CampeonatoController();

        System.out.println("--- CONFIGURACIÓN DEL CAMPEONATO ---");

        System.out.println("¿Cuantos coches van a competir?: ");
        int numCoches = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numCoches; i++) {
            System.out.println("\nDatos del coche " + (i + 1) + ":");
            System.out.println("Marca: ");
            String marca = scanner.nextLine();
            System.out.println("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.println("Dorsal");
            int dorsal = scanner.nextInt();
            scanner.nextLine();

            Coche c = new Coche(marca, modelo, dorsal);
            campeonato.añadirCoche(c);
        }

        System.out.println("\n¿Cuantas carreras tendrá el campeonato?: ");
        int numCarreras = scanner.nextInt();

        for (int i = 0; i < numCarreras; i++) {
            System.out.println("Introduce los KM para la carrera " + (i + 1) + ": ");
            int km = scanner.nextInt();

            Carrera ca = new Carrera(km);

            for (Coche c : campeonato.getCoches()) {
                ca.añadirCoche(c);
            }
            campeonato.añadirCarrera(ca);
        }

        controlador.ejecutarCampeonato(campeonato);

        // 1. ORDENAR LA GENERAL POR PUNTOS
        Collections.sort(campeonato.getCoches(), new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                // Comparamos de mayor a menor puntuación
                return Integer.compare(c2.getPuntosTotales(), c1.getPuntosTotales());
            }
        });

        // 2. IMPRIMIR TABLA FORMATEADA
        System.out.println("\n=== CLASIFICACIÓN GENERAL ===\n");
        // Los códigos %-12s sirven para reservar exactamente 12 huecos para cada palabra
        System.out.printf("%-10s %-15s %-10s %-10s%n", "Posición", "Piloto", "Dorsal", "Puntos");
        System.out.println("------------------------------------------------------------");

        int puesto = 1;
        for (Coche c : campeonato.getCoches()) {
            System.out.printf("%-10s %-15s %-10d %-10d%n",
                    puesto + "o",
                    c.getMarca(),
                    c.getDorsal(),
                    c.getPuntosTotales());
            puesto++;
        }
    }

}