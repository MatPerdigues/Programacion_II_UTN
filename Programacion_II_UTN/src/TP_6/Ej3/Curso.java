
package TP_6.Ej3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public void setProfesor(Profesor profesor){
        if(this.profesor == profesor) return;
        if(this.profesor != null){
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;
        if(profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }     
    }
    
    
    public Profesor getProfesor(){
        return this.profesor;
    }
    
    
    public String getCodigo(){
        return this.codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
        
    public void mostrarInfo(){
        if(this.profesor != null){
            System.out.println(this);                    
        }else{
            System.out.println("El Curso aún no tiene un profesor asignado");
        }
    }

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", profesor=" + profesor + '}';
    }

    
    
    
    
}


