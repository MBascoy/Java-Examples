public class Circulo extends Forma {
    public int radio;

    Circulo(){
        esTipo = Tipo.CIRCULO;
    }

    public static void printArea(Circulo circulo){
        double areaCirculo = 3.14 * (circulo.radio * circulo.radio);
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
