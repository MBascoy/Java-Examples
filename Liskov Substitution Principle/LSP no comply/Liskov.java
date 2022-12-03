public class Liskov {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo();

        calcularAreaForma(circulo);

    }

    public static void calcularAreaForma(Forma forma){
        if (forma.esTipo.equals("cuadrado")) {
            ((Cuadrado)forma).calcularArea();
        }
        else if (forma.esTipo.equals("circulo")) {
            ((Circulo)forma).calcularArea();
        }
    }
}