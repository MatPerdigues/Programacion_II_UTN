
package TP_6.Ej3;

import java.util.ArrayList; 
        
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores;
    private ArrayList<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>(); 
        this.cursos = new ArrayList<>(); 
    }
    
    
    public void agregarProfesor(Profesor profesor){
        profesores.add(profesor);
    }
    
    
    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);
        if(curso==null){
            System.out.println("No se ha encontrado un curso con ese codigo.");
        }
        else if(profesor==null){
            System.out.println("No existe un profesor con ese ID.");
        }        
        else{
            curso.setProfesor(profesor);
        }        
          
    }
    
    
    public void listarCursos(){
        for(Curso curso : cursos){
            System.out.println(curso);
        }
    }
    
    
    public void listarProfesores(){
        for(Profesor profesor : profesores){
            System.out.println(profesor);
        }
    }
    
    
    public Profesor buscarProfesorPorId(String id){
        Profesor profesor;
        int i=0;
        int x=0;
        while(i<profesores.size() && x==0){                       
            if(this.profesores.get(i).getId().equals(id)){
                x=1;
                return this.profesores.get(i);            }
            i++;
        }
        if(x==0){
            System.out.println("No se ha podido identificar ningun profesor con ese ID.");
        }        
         return null;       
    }
    
    
    public Curso buscarCursoPorCodigo(String codigo){
        Curso curso;
        int i=0;
        int x=0;
        while(i<cursos.size() && x==0){                       
            if(this.cursos.get(i).getCodigo().equals(codigo)){
                x=1;
                return this.cursos.get(i);
            }
            i++;
        }
        if(x==0){
            System.out.println("No existe un curso con ese codigo.");
        }        
         return null;
    }
    
    
    public ArrayList<Curso> eliminarCurso(String codigo){
    
        Curso curso  = buscarCursoPorCodigo(codigo);
        Profesor prof = curso.getProfesor();
            
        if(curso != null){            
            cursos.remove(curso);
            prof.eliminarCurso(curso);
        }
        System.out.println("Lista de cursos de la universidad actualizada.");
        System.out.println(this.cursos);
        System.out.println("");
        System.out.println("Cursos del profesor "+ prof.getNombre() + " actualizada" );
        System.out.println(prof.getCursos());        
        return this.cursos;        
    }
    
    
    public void eliminarProfesor(String id){
        Profesor prof = buscarProfesorPorId(id);
        ArrayList<Curso> cursos = prof.getCursos();
        int i = 0;
        while(i<cursos.size()){
            cursos.get(i).setProfesor(null);
        }
        this.profesores.remove(prof);
        System.out.println("Lista de profesores actualizada.");
        System.out.println(this.profesores);
    }

    public void mostrarReporte(){
        for(Profesor profesor : profesores){
            profesor.mostrarInfo();
        }
    }
    
    
}
