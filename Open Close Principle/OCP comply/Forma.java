import java.util.ArrayList;

public abstract class Forma {

    protected abstract void printArea();

    public static void imprimirAreaFormas(ArrayList<Forma> lista){

        for (Forma forma : lista) {
            forma.printArea();
        }
    }
}
