public class Main {

    public static void main(String [] args){
        //Autobox
        Integer numeroComplejo = 100;
        int numeroPrimitivo = numeroComplejo;

        //OPERADORES
             // aritmeticos; + - * / %
             // asignacion; = =+ =- =* =/ =%
             // relacionales; < <= == > >= !=
             // logicos; || && !

        int numero1 = 5;
        int numero2 = 6;
        int resultado = 5&6;
        System.out.println("El resultado de la comparación & es " + resultado);

        numero1 = 12;
        numero2 = 13;
        resultado = numero1 | numero2;
        System.out.println("El resultado de la comparación | es " + resultado);


        numero1 = 23;
        numero2 = 25;
        String palabra = null;
        boolean resultadoBool = numero1>numero2 || numero2<100 || numero1!=0 || palabra.length()!=0;
        System.out.println("El resultado de la comparación es " + resultadoBool);


    }
}
