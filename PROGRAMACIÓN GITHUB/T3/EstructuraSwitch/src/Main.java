public class Main {

    public static void main (String [] args){
        //Evaluar el dia de la semana y decir si es un dia laborable o no
        DiasSemana diaSemana = DiasSemana.Viernes;

        //solo funciona si tengo un level de 14 o superior

        switch (diaSemana){
            case Lunes, Martes, Miercoles, Jueves -> System.out.println("Laborable");
            case Viernes -> System.out.println("Laborable, animo falta poco!!");
            case Sabados, Domingos -> System.out.println("Descanso");
            }


        MesesAnio mesActual = MesesAnio.Noviembre;
        //System.out.println("La fecha de hoy es 7 de "+MesesAnio.Noviembre+" de 2025 y es "+DiasSemana.Viernes);
        System.out.printf("La fecha de hoy es %d de %s de %d y es %s estamos en la estacion de %s, los dias que tiene este mes son %d%n",7,MesesAnio.Noviembre,2025,DiasSemana.Viernes,MesesAnio.Noviembre.estacion,MesesAnio.Noviembre.diasMes);
    Operaciones operaciones = new Operaciones();
    operaciones.evaluarServidor("ok");
    }

    }

