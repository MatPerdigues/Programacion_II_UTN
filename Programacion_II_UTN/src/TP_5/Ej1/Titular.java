
package TP_5.Ej1;


public class Titular {
    private String nombre;
    private int dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    };
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getDni(){
        return this.dni;
    }
    
    public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte=pasaporte; 
        if(pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }
    
    public Pasaporte getPasaporte(){
        return this.pasaporte;
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}

