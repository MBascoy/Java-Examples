public class Cuadrado extends Forma {
    public int lado;

    Cuadrado(){
        esTipo = Tipo.CUADRADO;
    }

    public static void printArea(Cuadrado cuadrado){
        double areaCuadrado = cuadrado.lado * cuadrado.lado;
        System.out.println("El area del cuadrado es: " + areaCuadrado);
    }

}
