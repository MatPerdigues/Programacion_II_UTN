
package TP_7.Ej3;


public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
   
    protected abstract void calcularSueldo();
}
