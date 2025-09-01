
package TP_3;

public class Estudiante {    
       
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
    
    public void setNombre(String nombre){
        if (nombre.matches("[a-zA-Z]+")){
            this.nombre = nombre;    
        }else{
            System.out.println("**Nombre no valido**");
        }
    }
    public void setApellido(String apellido){
        if (apellido.matches("[a-zA-Z]+")){
            this.apellido = apellido;    
        }else{
            System.out.println("**Apellido no valido**");
        }       
    }
    public void setCurso(String curso){
        if (curso.matches("[a-zA-Z]+")){
            this.curso = curso;    
        }else{
            System.out.println("**Curso no valido**");
        }       
    }
    public void setCalificacion(int calificacion){
        if(calificacion >= 0 && calificacion <=10){
        this.calificacion = calificacion;    
        }else{
            System.out.println("**Calificacion no valida**");
        }
    } 
        
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nApellido: "+apellido+"\nCurso: "+curso+"\nCalificacion: "+calificacion);
    }
    
    public int subirCalificacion(){
        if(this.calificacion<10){
            this.calificacion += 1;
        }
        System.out.println("Calificacion aumentada: "+calificacion);
        return this.calificacion;
        
    }    
    
    public int bajarCalificacion(){
        if(this.calificacion>0){
            this.calificacion -= 1;
        }
        System.out.println("Calificacion disminuida: "+calificacion);
        return this.calificacion;        
            
    }
    
    
}
