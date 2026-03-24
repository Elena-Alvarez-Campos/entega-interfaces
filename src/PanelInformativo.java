import javax.swing.*;

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
    public String procesarDatos(){
        return  "Panel: "+getId()+" Texto mostrado: "+textoMostrado+" Encendido: "+getEncendidio();
    }
    //Control remoto
    @Override
    public boolean conectarWifi(){
        return true;
    }
    @Override
    public void reiniciarDispositivo(){
        System.out.println( "Se ha reiniciado");
    }

}
