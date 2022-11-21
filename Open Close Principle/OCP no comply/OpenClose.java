import java.util.ArrayList;

public class OpenClose {
    public static void main(String[] args) {
        Circulo primerCirculo = new Circulo();
        Cuadrado primerCuadrado = new Cuadrado();

        primerCirculo.radio = 33;
        primerCuadrado.lado = 44;

        ArrayList<Forma> lista = new ArrayList<Forma>();

        lista.add(primerCirculo);
        lista.add(primerCuadrado);

        Forma.imprimirAreaFormas(lista);
    }
}