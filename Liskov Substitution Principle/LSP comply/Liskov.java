public class Liskov {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();

        calcularAreaForma(circulo);
    }

    public static void calcularAreaForma(Forma forma){
        forma.calcularArea();
    }
}