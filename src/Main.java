import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DispositivoIoT> lista =new ArrayList<DispositivoIoT>();
        GestorSmartCity gestor =new GestorSmartCity(lista);
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