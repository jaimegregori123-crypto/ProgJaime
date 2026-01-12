public class MainBonoloto {
    static void main(String[] args) {
        Bonoloto bonoloto = new Bonoloto();
        bonoloto.iniciarJuego();
        System.out.println("Los numeros del sistema son: ");
        bonoloto.listarNumerosSistema();
        System.out.println("Los numeros del usuario son: ");
        bonoloto.listarNumerosUsuario();
    }
}
