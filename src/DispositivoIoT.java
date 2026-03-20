public abstract class DispositivoIoT {
    //atributos
    private String id;
    private String ubicacion;
    private boolean encendidio;
    //Constructor
    public DispositivoIoT(String id, String ubicacion){
        this.id=id;
        this.ubicacion=ubicacion;
        this.encendidio=false;
    }
    //Geters y Setters
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public String getUbicacion(){
        return ubicacion;
    }
    public void setEncendidio(boolean encendidio) {
        this.encendidio = encendidio;
    }
    public boolean getEncendidio() {
        return encendidio;
    }
    //metodos
    public void encender(){
        this.encendidio=true;
    }
    public void apagar(){
        this.encendidio=false;
    }
    //metodo abstracto
    public abstract void procesarDatos();
}
