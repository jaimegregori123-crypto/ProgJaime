package controller;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Object[]> listaContactos;

    public Agenda(){
        listaContactos = new ArrayList<>();
    }

    public void agregarContacto(Object[] contacto){
        listaContactos.add(contacto);
        System.out.println("Contacto agregado correctamente");
    }

    public void borrarContacto(String dni){
        for (Object[] item: listaContactos){
            if (item[4].equals(dni)){
               listaContactos.remove(item);
               return;
            }
        }
        System.out.println("No encontrado");

    }

    public void buscarContacto(String dni){
        for (Object[] item: listaContactos){
            if (item[4].equals(dni)){
                System.out.println("Contacto encontrado");
                System.out.println("Nombre"+ item[0]);
                System.out.println("Apellido"+ item[1]);
                System.out.println("Correo"+ item[2]);
                System.out.println("Telefono"+ item[3]);
                return;
            }
        }
        System.out.println("No encontrado");
    }

    public void listarContactos() {
        for (Object[] item : listaContactos) {
            System.out.println("Contacto encontrado");
            System.out.println("Nombre" + item[0]);
            System.out.println("Apellido" + item[1]);
            System.out.println("Correo" + item[2]);
            System.out.println("Telefono" + item[3]);
        }
    }

    public ArrayList<Object[]> getListaContactos() {
            return listaContactos;
        }

    public void setListaContactos(ArrayList<Object[]> listaContactos) {
        this.listaContactos = listaContactos;
    }
}
