public class Boton {
    
    Bombilla bombilla = new Bombilla() ;
    private boolean activado = true;


    Boton(Bombilla bombilla){
        this.bombilla = bombilla;
    }
    public void pulsarBoton(){
        if (activado){
            activado = !activado;
            bombilla.apagarLuz();
        }
        else{
            activado = !activado;
            bombilla.encenderLuz();

        }
    }
}
