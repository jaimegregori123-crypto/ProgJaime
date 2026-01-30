package controller;

import model.Campeonato;
import model.Carrera;
import model.Coche;

public class CampeonatoController {
    private CarreraController gestorCarrera = new CarreraController();

    public void ejecutarCampeonato(Campeonato camp) {
        int numeroCarrera = 1;

        for (Carrera carreraActual : camp.getCarreras()) {
            for (Coche c : camp.getCoches()) {
                c.setKmRecorridos(0);
            }

            gestorCarrera.iniciarCarrera(carreraActual);
            repartirPuntos(carreraActual);

            System.out.println("\n=== CARRERA " + numeroCarrera + " ===");
            System.out.println("1o - " + carreraActual.getListaCoches().get(0).getMarca() + " [10 puntos]");
            System.out.println("2o - " + carreraActual.getListaCoches().get(1).getMarca() + " [8 puntos]");
            System.out.println("3o - " + carreraActual.getListaCoches().get(2).getMarca() + " [6 puntos]");

            numeroCarrera++;
        }
    }

    private void repartirPuntos(Carrera carrera){

        if (carrera.getListaCoches().size() >= 1) {
            Coche primero = carrera.getListaCoches().get(0);
            primero.setPuntosTotales(primero.getPuntosTotales() +10);
        }
        if (carrera.getListaCoches().size() >= 2) {
            Coche segundo = carrera.getListaCoches().get(1);
            segundo.setPuntosTotales(segundo.getPuntosTotales() +8);
        }
        if (carrera.getListaCoches().size() >= 3) {
            Coche tercero = carrera.getListaCoches().get(2);
            tercero.setPuntosTotales(tercero.getPuntosTotales() + 6);
        }

    }
}
