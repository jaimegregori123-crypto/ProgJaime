import controller.Agenda;
import model.Persona;

public class Main {

    static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.agregarPersona(new Persona("Jaime1", "Gregori1", "1234"));
        agenda.agregarPersona(new Persona("Jaime2", "Gregori2", "12345"));
        agenda.obtenerPersonas();
    }
}
