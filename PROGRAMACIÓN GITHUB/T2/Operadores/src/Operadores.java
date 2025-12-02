import java.sql.SQLOutput;
import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos() {
        //unarios
        int operandoUno = 5;
        //incremento -> para poder hacer un contador
        operandoUno++;
        operandoUno++;
        operandoUno++;
        operandoUno++;

        System.out.println("El valor del operando uno después de los incrementos es " + operandoUno);

        //decremento -> le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;

        System.out.println("El valor del operando uno después de los decrementos es " + operandoUno);
        // binarios -> dos operadores: suma (+) resta (-) multi (*) div (/) modulo-resto división (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        int resta = operandoUno - operandoDos;
        int multi = operandoUno * operandoDos;
        double division = (double) operandoUno / operandoDos;
        int modulo = 7 % 2;
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El resultado de la resta es " + resta);
        System.out.println("El resultado de la multiplicacón es " + multi);
        System.out.println("El resultado de la división es " + division);
        System.out.println("El resto de la división es " + modulo);
        // el modulo me vale para ver si un numero es par o impar


    }

    public void operadoresAsignacion() {
        int operadorUno = 10;
        int operadorDos = 6;
        //
        operadorUno = operadorUno + 5; // el operador uno guarda la suma de lo que valia operadorUno + 5
        operadorUno += operadorDos;
        System.out.println("El valor de operador 1 es " + operadorUno);

        operadorUno -= 5;
        operadorUno *= 2;
        operadorUno %= 2;

        System.out.println("El resultado de las asignaciones completas es de: " + operadorUno);


    }

    //seran utilizados como condiciones para ejecutar una parte del codigo o otra
    public void operadorComparacion() {
        int operandoUno = 10;
        int operandoDos = 20;
        boolean resultado = operandoUno > operandoDos;
        System.out.println("El resultado de la comparación es: " + resultado);
        resultado = operandoUno < operandoDos;
        System.out.println("El resultado de la comparación es: " + resultado);
        resultado = operandoUno <= operandoDos;
        resultado = operandoUno == operandoDos;
        resultado = operandoUno != operandoDos;


    }


    public void operadoresLogicos() {
        int sueldo = 20000;
        int edad = 45;
        boolean conducir = true;
        //cuando quiere cobrar menos de 30.000 y tiene menos de 40 y puede conducir
        boolean candidatoValido = sueldo < 30000 && edad < 40 && conducir;
        candidatoValido = sueldo < 20000 || edad < 25 || conducir && sueldo > 25000 && edad > 60;
        System.out.println("El candidato es valido: " + candidatoValido);
    }

    public void cambioTipos() {
        double numeroDecimal = 5.98;
        int numeroEntero = 7;
        double numero = numeroEntero;
        System.out.println((int) numeroDecimal);
        System.out.println((double) numeroEntero);
        String palabra = "Hola";
        int numeroPalabra = Integer.valueOf(palabra);
        System.out.println(numeroPalabra + 10);

        int numeroEvaluar = 12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar);


    }


    public void evaluarCandidato(double sueldo, int edad, boolean conducir, String nombre) {
        boolean resultado = sueldo <= 20000 && edad < 40 && conducir;
        System.out.println("Evaluando al candidato " + nombre);
        System.out.println("La evaluacion del candidato es:" + resultado);

    }

    public void ejercicioNotion4Tema2()

    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numero quieres comprobar si es par");
        int numero = scanner.nextInt();
        boolean numeroPar = numero % 2 == 0;
        System.out.printf("El numero %d es par: %b " ,numero,numeroPar);
        scanner.close();

    }

    public void ejercicioNotion10Tema2(){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Indica el salario base");
        int salarioBaseHora = scanner.nextInt();
        System.out.println("Indica tus horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has realizado horas extras?");
        boolean horasExtras = scanner.nextBoolean();
        boolean condicionExtras = horasTrabajadas>40 && horasExtras;
        // si condicionExtras es true

        int horasExtrasTotal = horasTrabajadas -40;
        int salarioBase = 40*salarioBaseHora;
        int salarioBaseExtra = horasExtrasTotal* salarioBaseHora *2;
        int salarioTotal = salarioBase + salarioBaseExtra;

        System.out.println("Has cobrado un total de " + salarioTotal);
        System.out.println("Has cobrado una base de " + salarioBase);
        System.out.println("Has cobrado un extra de " + salarioBaseExtra);




    }
}
