public class Boton {
    
    private boolean activado = true;


    public void pulsarBoton(Interruptor dispositivo){
        if (activado){
            activado = !activado;
            dispositivo.apagar();
        }
        else{
            activado = !activado;
            dispositivo.encender();

        }
    }
}
