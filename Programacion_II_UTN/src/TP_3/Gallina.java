
package TP_3;

import java.util.Scanner;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public int getIdGallina(){
        return this.idGallina;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public int getHuevosPuestos(){
        return this.huevosPuestos;
    }
    
    public void setIdGallina(int idGallina){
        this.idGallina=idGallina;
    }
    
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    public void setHuevosPuestos(int huevosPuestos){
        this.huevosPuestos=huevosPuestos;
    }
    
    
    public void ponerHuevo(){
        this.huevosPuestos += 220;
    }
    
    public void mostrarEstado(){
        System.out.println("Id Gallina: "+getIdGallina()+"\nEdad: "+getEdad()+"\nHuevos Puestos: "+getHuevosPuestos());
    }
    
    public void envejecer(){        
        int opcion;
        Scanner input = new Scanner(System.in);        
        while(true){
            if(this.edad==10){
                break;
            }else{            
                System.out.println("Ingrese [1] para simular 1 año transcurrido.");
                System.out.println("Ingrese cualquier otro tecla para salir.");            
                if(input.hasNextInt()){
                    opcion = input.nextInt();             
                    while(opcion==1){
                        if(this.edad==10){
                            System.out.println("La gallina "+getIdGallina()+" ha dejado este plano terrenal. Sus seres queridos la despiden con afecto.");
                            break;
                        }else{
                            System.out.println("**Datos Actualizados**");
                            this.edad += 1;
                            ponerHuevo();
                            mostrarEstado();
                            System.out.println("Ingrese [1] para simular 1 año transcurrido."); 
                            System.out.println("Ingrese cualquier otra tecla para salir.");
                            if(input.hasNextInt()){
                                opcion = input.nextInt();
                            }else{
                                break;                        
                            }
                        }
                    }
                    break;
                }else{
                    break;
                }
            }
        }
    }
    
    
    
}
