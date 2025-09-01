
package TP_3;

import java.util.Scanner;

public class Libro {
    private String titulo = "El Husar";
    private String autor = "Arturo Perez Reverte";
    private int anioPublicacion = 1999;
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public int getAnioPublicacion(){
        return this.anioPublicacion;
    }
    
    public void setAnioPublicacion(){
        Scanner input = new Scanner(System.in);
        int anioActualizado;        
        while(true){
            System.out.println("Ingrese el año de publicacion: ");
            if(input.hasNextInt()){
                this.anioPublicacion = input.nextInt();  
                break;
            }else{
                System.out.println("Dato no valido. Intente nuevamente.");
                input.next();
            }            
        }
        
        System.out.println("*Informacion actualizada*");
        System.out.println("Titulo: "+getTitulo()+"\nAutor: "+getAutor()+"\nAño de publicacion: "+getAnioPublicacion());
    
    }
    
}
