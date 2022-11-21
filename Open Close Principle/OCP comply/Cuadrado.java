public class Cuadrado extends Forma {
    public int lado;

    protected void printArea(){
        int areaCuadrado = this.lado * this.lado;
        System.out.println("El area del cuadrado es: " + areaCuadrado);
    }

}
