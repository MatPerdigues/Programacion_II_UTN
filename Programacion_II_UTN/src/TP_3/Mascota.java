package TP_3;

import java.util.Scanner;


public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    public void setNombre(String nombre){
        if (nombre.matches("[a-zA-Z]+")){
            this.nombre = nombre;    
        }else{
            System.out.println("**Nombre no valido**");
        }
    }
    
    public void setEspecie(String especie){
        if (especie.matches("[a-zA-Z]+")){
            this.especie = especie;    
        }else{
            System.out.println("**Especie no valida**");
        }
    }
    
    public void setEdad(int edad){
        if (edad>=0){
            this.edad = edad;    
        }else{
            System.out.println("**Edad no valida**");
        }
    }
     
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad);
    }
    
    public void cumplirAnios(){
        Scanner input = new Scanner(System.in);
        int aniosCumplidos;        
        while(true){
            System.out.println("Ingrese los años cumplidos: ");
            if(input.hasNextInt()){
                aniosCumplidos = input.nextInt() + this.edad;  
                break;
            }else{
                System.out.println("Dato no valido. Intente nuevamente.");
                input.next();
            }            
        }
        setEdad(aniosCumplidos);
        System.out.println("");
        System.out.println("**Datos Actualizados**");
        System.out.println("Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad);
    }
    
}
