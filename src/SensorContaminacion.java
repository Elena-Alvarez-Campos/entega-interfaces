public class SensorContaminacion extends DispositivoIoT implements  Mantenible{
    //Atributos
    private double nivelCO2;
    //constructor
    public SensorContaminacion(double nivelCO2,String id, String ubicacion){
        super(id,ubicacion);
        this.nivelCO2=nivelCO2;
    }
    //getters y setters
    public void setNivelCO2(double nivelCO2) {
        this.nivelCO2 = nivelCO2;
    }
    public double getNivelCO2() {
        return nivelCO2;
    }
    //metodos
    @Override
    public void procesarDatos(){

    }

    //Mantenimiento
    @Override
    public double calcularCosteMantenimiento(){
        return 50;
    }
    @Override
    public void realizarMantenimiento(){}
}
