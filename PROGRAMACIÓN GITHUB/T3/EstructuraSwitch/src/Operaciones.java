public class Operaciones {

    public void evaluarServidor(String estado){
        //200 ok
        //400 ok, pero pagina no disponible
        //500 fail, caido

        switch (obtenerCodigo(estado)){
            case 200->{
                System.out.println("Pagina ok");
            }
            case 400->{
                System.out.println("Servidor ok, pagina no ok");
            }
            case 500->{
                System.out.println("Servidor no ok");
            }
        }
    }
    private int obtenerCodigo(String estado){
        if (estado.equals("ok")){
            return 200;
        } else if (estado.equals("ok_fail")){
            return 400;
        } else  {
            return 500;
        }
    }
}
