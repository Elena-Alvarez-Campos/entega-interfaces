import java.util.ArrayList;
import javax.swing.JOptionPane;
public class GestorSmartCity {
    //Artributos
    public ArrayList<DispositivoIoT> lista;
    //constructor
    public GestorSmartCity(ArrayList<DispositivoIoT> lista){
        this.lista=lista;
    }
    //Getters y setters
    public void setLista(ArrayList<DispositivoIoT> lista) {
        this.lista = lista;
    }
    public ArrayList<DispositivoIoT> getLista() {
        return lista;
    }
    //Métodos
    @Override
    public String toString(){
        return "Lista:"+lista;
    }
    //Nuevo  dispositivo**********************************
    public void nuevoDispositivo(){
        boolean programa=true;
        int opcion=0;
        while (programa==true){
            String categoria= JOptionPane.showInputDialog("¿Que tipo de dispositivo se va a añadir?**********\n" +
                    "1.Semáforo inteligente\n" +
                    "2.Sensor de contaminación\n" +
                    "3.Panel informativo\n"+
                    "4.Salir");
            try{
                opcion=Integer.parseInt(categoria);
                if(opcion==4){programa=false;}
                else if (opcion<=0&opcion>4){
                    JOptionPane.showMessageDialog(null,"Elige una opción correcta");
                }
                else{
                    String id=this.lista.size()+1+"";
                    boolean prestado=false;
                    switch (opcion){
                        case 1://Semáforo
                            String ubi=JOptionPane.showInputDialog("Introduce la ubicación del semáforo");
                            String estado=JOptionPane.showInputDialog("Introduce el estado actual del semáforo");
                            Semaforointeligente semaforonuevo=new Semaforointeligente(estado,id,ubi);
                            this.lista.add(semaforonuevo);
                            programa=false;
                            break;
                        case 2://Sensor
                            String ubi2=JOptionPane.showInputDialog("Introduce la ubicación del sensor");
                            String nivel=JOptionPane.showInputDialog("Introduce el nivel de CO2");
                            try{
                                double nCO2=Integer.parseInt(nivel);
                                SensorContaminacion sensorNuevo = new SensorContaminacion(nCO2,id,ubi2);
                                this.lista.add(sensorNuevo);
                                programa=false;
                            }catch (Exception e){
                                JOptionPane.showMessageDialog(null,"Elige una opción correcta");
                            }
                            break;
                        case 3://Panel
                            String ubi3=JOptionPane.showInputDialog("Introduce la ubicación del panel");
                            String txt=JOptionPane.showInputDialog("Introduce el texto mostrado en el panel");
                            PanelInformativo panelnuevo =new PanelInformativo(txt,id,ubi3);
                            this.lista.add(panelnuevo);
                            programa=false;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Elige una opción correcta");
                    }
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Elige una opción correcta");
            }

        }
    }
    //Mostrar estado red**************************************************
    public String mostrarEstado(){
        String dispositivos="";
        for(int i=0; i<=this.lista.size();i++){
            dispositivos+=this.lista.get(i).procesarDatos()+"\n";
        }
        return dispositivos;
    }
    //Mantenimiento
    public void mantenimientoGlobal(){
        double costeFin=0;
        for(int i=0; i<=this.lista.size();i++){
            if(this.lista.get(i) instanceof Mantenible==true){
                costeFin += ((Mantenible) this.lista.get(i)).calcularCosteMantenimiento();
                JOptionPane.showMessageDialog(null,"Factura total: "+costeFin);
            }
        }
    }
    //ReinicioEmergencia
    public void reinicioEmergencia(){
        for(int i=0; i<=this.lista.size();i++){
            if(this.lista.get(i) instanceof ControlableRemotamente==true){
                ((ControlableRemotamente) this.lista.get(i)).conectarWifi();
                ((ControlableRemotamente) this.lista.get(i)).reiniciarDispositivo();
            }
        }
    }

}
