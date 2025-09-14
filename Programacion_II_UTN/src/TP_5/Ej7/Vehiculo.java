
package TP_5.Ej7;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;
    
    public Vehiculo(String modelo, String patente, Motor motor){
        this.patente=patente;
        this.modelo=modelo;
        this.motor=motor;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void verVehiculo(){
        System.out.println("Patente: "+this.patente+" Modelo: "+modelo+" "+motor+" "+conductor);
    }
    
    public void setConductor(Conductor conductor){
        this.conductor=conductor;
        if(conductor != null && conductor.getVehiculo() != this){
            conductor.setVehiculo(this);
        }
    }
    
    public Conductor getConductor(){
        return this.conductor;
    }
    
}
