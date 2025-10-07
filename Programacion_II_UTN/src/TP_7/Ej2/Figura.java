
package TP_7.Ej2;


public abstract class Figura {
    private String nombre;
    
    protected Figura(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
       
    protected abstract void calcularArea();       
    
}
