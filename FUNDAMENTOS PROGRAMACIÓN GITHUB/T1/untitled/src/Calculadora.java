public class Calculadora {

    public void sumar (int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suma es: " + resultado);


    }



    public void restar (int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultado de la resta es: " + resultado);


    }

    public int multiplicar (int op1, int op2){
        int resultado = op1 * op2;
        System.out.println("El metodo está listo para retornar");
        return resultado;

    }

    public boolean validarNumero(int numeroValidar){
        return numeroValidar>0;
    }
}
