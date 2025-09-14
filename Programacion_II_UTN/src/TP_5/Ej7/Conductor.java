
package TP_5.Ej7;


public class Conductor {
    private String nombre;
    private String licencia;
    private Vehiculo vehiculo;
    
    public Conductor(String nombre, String licencia){
        this.nombre=nombre;
        this.licencia=licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLicencia() {
        return licencia;
    }    
        
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo=vehiculo;
        if(vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }
    
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    }

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", licencia=" + licencia + '}';
    }
    
    
}
