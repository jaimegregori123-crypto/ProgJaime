import model.Coche;

import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        Coche ford = new Coche("Ford", "Focus", "1234A", "Verde", 150);
        Coche opel = new Coche();
        Coche mercedes = new Coche("Mercedes", "Clase C", 80.000);
        Coche audi = new Coche("Audi", "Etron", 120.000, 500);
        audi.setCv(70);
        System.out.println("Los cv que tiene el audi son "+audi.getCv());
        System.out.println("El modelo del audi es "+audi.getModelo());

    }
}
