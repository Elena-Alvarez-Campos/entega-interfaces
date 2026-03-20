public class PanelInformativo extends DispositivoIoT implements ControlableRemotamente{
    //Atributos
    private String textoMostrado;
    //Constructor
    public PanelInformativo(String textoMostrado,String id,String ubicacion){
        super(id,ubicacion);
        this.textoMostrado=textoMostrado;
    }
    //Metodos
    @Override
    public void procesarDatos(){

    }
    //Control remoto
    @Override
    public boolean conectarWifi(){
        return true;
    }
    @Override
    public void reiniciarDispositivo(){

    }

}
