public class Circulo extends Forma {
    public int radio;

    protected void printArea(){
        double areaCirculo = 3.14 * (this.radio * this.radio);
        System.out.println("El area del circulo es: " + areaCirculo);
    }
}
