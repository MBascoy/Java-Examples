/**
 * main
 */
public class main {

    public static void main(String[] args) {
        
        Bombilla bombilla = new Bombilla();
        Boton boton = new Boton(bombilla);

        boton.pulsarBoton();
        boton.pulsarBoton();
    }
}