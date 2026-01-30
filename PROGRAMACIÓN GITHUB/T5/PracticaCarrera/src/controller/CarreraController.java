package controller;

import model.Carrera;
import model.Coche;
import java.util.Collections;
import java.util.Comparator;

public class CarreraController {

    public void iniciarCarrera(Carrera c) {
        boolean meta = false;
        int kmMeta = c.getKmTotales();

        System.out.println("---- COMIENZA LA CARRERA ----");

        while (!meta) {
            for (Coche coche : c.getListaCoches()) {
                int avance = (int) (Math.random() * 31) + 20;
                coche.setKmRecorridos(coche.getKmRecorridos() + avance);

                if (coche.getKmRecorridos() >= kmMeta) {
                    meta = true;
                }
            }
        }
        ordenarCoches(c);
    }

    private void ordenarCoches(Carrera c) {
        Collections.sort(c.getListaCoches(), new Comparator<Coche>() {
            @Override
            public int compare(Coche c1, Coche c2) {
                return Double.compare(c2.getKmRecorridos(), c1.getKmRecorridos());
            }
        });
    }
}

