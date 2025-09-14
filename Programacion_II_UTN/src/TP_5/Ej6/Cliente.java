
package TP_5.Ej6;


public class Cliente {
    private String nombre;
    private int telefono;
    
    public Cliente(String nombre, int telefono){
        this.nombre=nombre;
        this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
