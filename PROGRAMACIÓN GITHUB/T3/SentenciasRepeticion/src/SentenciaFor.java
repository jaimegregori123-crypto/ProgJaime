public class SentenciaFor {

    public void sentenciaFor (){

        for (int i=0;i<100;i++){
        try {
            System.out.printf("Ejecuciones "+ i);
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        }
    }

    public void tablaMultiplicarNumero(int numero){

        System.out.println("Procedemos a escribir la tabla de multiplicar del "+ numero);
        for (int i= 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n" ,i,numero,i*numero);
        }
    }

    public void dibujarCuadrado(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++){
                if (i == 0 || i == 4){
                    System.out.print("*");
                } else if (j==0|| j==4) {
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();


        }

    }

    public void palabraPalindromo(){
        String frase = "alli ves sevilla";
        frase = frase.replaceAll(" ", "");
        boolean esPalindromo = true;
        for (int i = 0; i < frase.length() / 2; i++){

            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length()-1-i);
            if (letraUno!=letraDos){
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo){
            System.out.println("La palabra es palindromo");
        } else{
            System.out.println("La palabra no es palindromo");
        }
    }

    public void calcularFactorial(){
        //5!= 5*4*3*2*1

        int numeroCalcular = 4;
        int factorial = 1;
        for (int i = 1; i <= numeroCalcular; i++) {
           factorial *= i;
        }
        System.out.printf("El factorial de %d es %d",numeroCalcular,factorial);
    }

    public void recorrerColeccion(){
        int[] numeros= {1,10,98,48};
        for (int item: numeros){
            System.out.println(item);
        }


        }
    }


