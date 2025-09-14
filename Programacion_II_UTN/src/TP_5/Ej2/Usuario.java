
package TP_5.Ej2;


public class Usuario {
    private String nombre;
    private int dni;
    private Celular celular;
    
    public Usuario(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void setCelular(Celular celular){
        this.celular=celular;
        if(celular != null && celular.getUsuario() != this){
            celular.setUsuario(this);
        }
    }
    
    public Celular getCelular(){
        return this.celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni +'}';
    }
    
    
}
