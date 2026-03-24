import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DispositivoIoT> dispositivos =new ArrayList<DispositivoIoT>();

        Semaforointeligente sem1 =new Semaforointeligente("Verde","1","Vigo");
        PanelInformativo panel1 =new PanelInformativo("Hola.","2","Aqui");
        SensorContaminacion sensor1=new SensorContaminacion(1,"3","Allí");

        dispositivos.add(sem1);
        dispositivos.add(sensor1);
        dispositivos.add(panel1);

        GestorSmartCity gestor =new GestorSmartCity(dispositivos);
        //Menú
        boolean programa=true;
        int opcion=0;
        while(programa==true){
            String menu= JOptionPane.showInputDialog("     Menú     \n" +
                    "*********************\n" +
                    "Opciones:\n" +
                    "1.Añadir un nuevo dispositivo\n" +
                    "2.Mostrar estado de la red\n" +
                    "3.Lanzar mentenimiento global\n" +
                    "4.Reinicio remoto de emergencia\n" +
                    "5.Salir");
            try{
                opcion=Integer.parseInt(menu);
                switch(opcion){
                    case 1:
                        gestor.nuevoDispositivo();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null,gestor.mostrarEstado());
                        break;
                    case 3:
                        gestor.mantenimientoGlobal();
                        break;
                    case 4:
                        gestor.reinicioEmergencia();
                        break;
                    case 5:
                        programa=false;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Elige una opción compatible");
                        break;
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Elige una opción compatible");
            }
        }


    }
}