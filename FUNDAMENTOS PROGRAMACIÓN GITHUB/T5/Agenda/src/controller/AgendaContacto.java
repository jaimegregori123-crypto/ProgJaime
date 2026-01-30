package controller;

import model.Contacto;

import java.util.ArrayList;

public class AgendaContacto {
    private ArrayList<Contacto> listaContactos;
    private int id;
    public AgendaContacto(){
        listaContactos = new ArrayList<>();
        id = 1;
    }

    public void agregarContactos(Contacto contacto){
        if (estaContacto(contacto.getDni())==null){
            contacto.setId(id);
            listaContactos.add(contacto);
            id++;
        } else {
            System.out.println("No se puede agregar, dni duplicado");
        }
    }

    private Contacto estaContacto(String dni){
        for (Contacto contacto : listaContactos) {
            if (contacto.getDni().equals(dni)){
                return contacto;
            }
        }
        return null;
    }

    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
