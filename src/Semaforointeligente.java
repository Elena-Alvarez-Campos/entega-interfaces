public class Semaforointeligente extends DispositivoIoT implements ControlableRemotamente, Mantenible{
    //Atributos
    private String estadoActual;
    //Constructor
    public Semaforointeligente(String estadoActual, String id, String ubicacion){
        super(id,ubicacion);
        this.estadoActual=estadoActual;
    }
    //Getters y setters
    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }
    public String getEstadoActual() {
        return estadoActual;
    }
    //Metodos
    @Override
    public void procesarDatos(){

    }

    //Mantenimiento
    @Override
    public double calcularCosteMantenimiento(){
        return 150;
    }
    @Override
    public void realizarMantenimiento(){}
    //Control remoto
    @Override
    public boolean conectarWifi(){
        return true;
    }
    @Override
    public void reiniciarDispositivo(){

    }
}