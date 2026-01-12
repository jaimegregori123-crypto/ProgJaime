import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. añadir correo");
            System.out.println("2. listar correo");
            System.out.println("3. buscar correo");
            System.out.println("4. Añadir iterativo");
            System.out.println("Indica que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Dime el correo que quieres añadir");
                    String correo = scanner.next();
                    if (controller.metodoAnadir(correo)) {
                        System.out.println("Usuario añadido correctamente");
                    } else {
                        System.out.println("El usuario no se ha podido agregar");
                    }
                    ;
                } // en caso de añadirlo digo agregado correctamente, en caso contrario te digo que error
                case 2 -> {
                    controller.metodoListar();
                }
                case 3 -> {
                    System.out.println("Indica el correo que quieres buscar");
                    String correo = scanner.next();
                    if (controller.metodoBuscar(correo)) {
                        System.out.println("Perfecto, el correo esta en la lista");
                    } else {
                        System.out.println("El correo no esta en la lista");
                    }
                    ;
                }
                case 4 -> {
                    //no quiero que puedan poner correos repetidos
                    System.out.println("Vamos a añadir recurrentemente");
                    for (int i = 0; i < 5; i++) {
                        String correo;
                        do {
                            System.out.println("Indica el correo a añadir");
                            correo = scanner.next();
                            if (controller.metodoBuscar(correo)){
                                System.out.println("El correo ya esta");
                            }
                        } while (controller.metodoBuscar(correo));
                        controller.metodoAnadir(correo);

                    }
                }
            }
        }while (opcion != 5) ;
    }
}
