package model;

public enum Categoria {
    ALIMENTACION(), MUEBLES("Esta categoria es de muebles para decorar"), ROPA(), TECNOLOGICO("Esta categoria marca productos de ultima generacion");

    private String descripcion;

    Categoria(){}

    Categoria(String dscripcion){
        this.descripcion = descripcion;
    }

    public void incrementarAlgo(){

    }

    public String getDescripcion() {
        return descripcion;
    }
}
