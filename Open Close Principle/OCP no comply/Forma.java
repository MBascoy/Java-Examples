import java.util.ArrayList;

public class Forma {
    public enum Tipo {CIRCULO, CUADRADO};

    public Tipo esTipo;

    public static void imprimirAreaFormas(ArrayList<Forma> lista){

        for (Forma forma : lista) {
            switch (forma.esTipo) {
                case CUADRADO:
                    Cuadrado.printArea((Cuadrado)forma);;
                    break;

                case CIRCULO:
                    Circulo.printArea((Circulo)forma);;
                    break;
                default:
                    break;
            }
            
        }
    }
}
