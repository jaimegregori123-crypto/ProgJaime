import java.util.ArrayList;
import java.util.Objects;

public class Main {

    static ArrayList<Object[]> listaContactos = new ArrayList<>();

    static void main(String[] args) {

        listaContactos.add(new Object[]{"Borja", "Martin", "1234A", 12345678});
        listaContactos.add(new Object[]{"Maria", "Lopez", "2134A", 23456789});
        listaContactos.add(new Object[]{"Juan", "Gomez", "3456A", 34567890});
        mostrarContactos();
        System.out.println("Vamos a sacar solamente el nombre del ultimo contacto");
        listaContactos.add(new Object[]{"Marta", "Gomez", "4567A",34567});
        Object[] contacto = listaContactos.get(listaContactos.size()-1);
        System.out.println(contacto[0]);
        System.out.println("Procedemos ahora a borrar un elemento");
        borrarContacto("1234A");
        mostrarContactos();

    }

    static void mostrarContactos() {
        for (Object[] contacto: listaContactos){
            System.out.println("Imprimiendo datos del contacto");
            System.out.printf("\tNombre: %s Apellido %s DNI: %s Telf:%d%n",
                    contacto[0], contacto[1], contacto[2], (int)contacto[3]);
        }
    }

    static void borrarContacto(String dni){
        //listaContactos
        for (int i = 0; i < listaContactos.size() ; i++) {
            if (listaContactos.get(i)[2].equals(dni)){
                listaContactos.remove(listaContactos.get(i));
                break;
            }
        }
    }
}
