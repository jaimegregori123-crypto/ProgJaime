package model;

public class Administrador extends Usuario{
    public Administrador(String nombre, String apellido, String dni, String correo, String password){
        // Llama al constructor del padre con todos los datos
        super(nombre, apellido, dni, correo, password);
    }
}
