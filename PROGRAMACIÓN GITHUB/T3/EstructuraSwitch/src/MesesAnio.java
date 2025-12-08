public enum MesesAnio {
    Enero("invierno",1,30), Febrero("invierno",2,28), Marzo("invierno",3,30), Abril("primavera",4,29), Mayo("primavera",5,31), Junio("primavera",6,30), Julio("verano",7,29), Agosto("verano",8,30), Septiembre("verano",9,30), Octubre("otoño",10,31), Noviembre("otoño",11,30), Diciembre("invierno",12,31);
// me vale para construir los enum de MesesAnio
    int numeroMes;
    int diasMes;
    String estacion;

    MesesAnio(String estacionp, int numeroMesP, int diasMesP){
        estacion = estacionp;
        numeroMes = numeroMesP;
        diasMes = diasMesP;


    }
    }
