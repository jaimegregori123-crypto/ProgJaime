public class SentenciaIF {
    public void  examenAprobado(int nota){
        System.out.println("Procedemos a evaluar si un examen esta OK");
        System.out.println("La nota que vamos a evaluar es "+ nota);
        if (nota>=5){
            System.out.println("El examen esta aprobado");
        } else {
            System.out.println("El examen esta suspenso");
        }
        System.out.println("Terminando la evaluación del examen");
        System.out.println("Programa finalizado");

    }
    public void notaExamen (int nota) {
        if (nota > 0 && nota <= 10) {
            if (nota > 0 && nota < 5) {
                  System.out.println("El examen esta suspenso");
            } else if (nota < 8) {
                System.out.println("El examen esta aprobado");
            } else if (nota < 9) {
                System.out.println("El examen es notable");
            } else if (nota < 10) {
                System.out.println("El examen es sobresaliente");
            } else {
                System.out.println("El examen esta de MH");
            }

        } else {
            System.out.println("La nota no esta en la escala correcta");
        }
    }
}
