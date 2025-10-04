
package TP_6.Ej3;

import java.util.ArrayList;

public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();    

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;        
    }
    
    
    public void agregarCurso(Curso curso){
        if (curso != null && !cursos.contains(curso)){
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);        
            }
        }
    }    
    
    
    public ArrayList<Curso> getCursos(){
        return this.cursos;
    }

    
    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }    

    
    public void eliminarCurso(Curso curso){
        int i = 0;
        int x = 0;
        while(i<cursos.size() && x==0){
            if(cursos.get(i)==curso){
                cursos.remove(i);
                x = 1;
            }
            i++;
        }
    }
    
   
    public void listarCursos(){
        System.out.println(this.cursos);
    }
    
    
    public void mostrarInfo(){
        System.out.println(this + "Cantidad de cursos: "+cursos.size());
    }


    @Override
    public String toString() {
        return "Profesor{" + "id=" + id + ", nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }

    
    
    
    
    
}
