import java.util.Scanner;

public class Ejercicios {

    public void ejercicio10(){
        /*

        Crea un programa que pida la altura del usuario (en cm)
        y determine si puede subir a una atracción.
        La altura mínima es 120 cm y la máxima es 200 cm.
        Si está dentro del rango, muestra "Puedes subir", si no, i
        ndica el motivo (demasiado bajo o demasiado alto).

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la altura en cm");
        int altura = scanner.nextInt();
        if (altura>=120 && altura<=200){
            System.out.println("Perfecto, puede subir");
        } else if (altura<120) {
            System.out.println("Demasiado bajito para subir");
        } else {
            System.out.println("Demasiado alto para subir");
        }
    }

    public void ejercicio12(){
       /*
       Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres de longitud,
        contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos y mostrar
        si la contraseña es válida o no, indicando qué requisitos no cumple.
            Nota: Para este ejercicio, asume que tienes funciones auxiliares
            como longitudCadena(texto), contienNumero(texto).
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que contraseña quieres evaluar");
        String contrasenia = scanner.next();

        boolean requisitoLong = contrasenia.length() >=8;
        boolean contieneNumero = contrasenia.contains("1") || contrasenia.contains("2") || contrasenia.contains("3") || contrasenia.contains("4") || contrasenia.contains("5") || contrasenia.contains("6") || contrasenia.contains("7") || contrasenia.contains("8") || contrasenia.contains("9") || contrasenia.contains("0");
        boolean passsInvalida =  contrasenia.equals("password") || contrasenia.equals("12345678");
        System.out.println("Requisito long: " + requisitoLong);
        System.out.println("Requisito numero: " + contieneNumero);
        System.out.println("Requisito pass invalida: " + passsInvalida);

        boolean passOK = requisitoLong && contieneNumero && !passsInvalida;
        System.out.println("La evaluación general es " + passOK);





    }

    public int longCadena (String cadena){
        return cadena.length();
    }

    public boolean contieneNumero(String cadena){
        return cadena.contains("1") || cadena.contains("1") || cadena.contains("2") || cadena.contains("3") || cadena.contains("4") || cadena.contains("5") || cadena.contains("6") || cadena.contains("7") || cadena.contains("8");    }
}
