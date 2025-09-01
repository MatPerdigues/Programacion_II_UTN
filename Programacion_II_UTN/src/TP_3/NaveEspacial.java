
package TP_3;

import java.util.Scanner;

public class NaveEspacial {
    private String nombre;
    private double combustible;
    public String getNombre(){
        return this.nombre;
    }
    public double getCombustible(){
        return this.combustible;
    }
    public void setCombustible(double consumo){
        this.combustible += consumo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre: "+this.nombre+"\nCombustible: "+getCombustible()+"%");
    }
    
    public void despegar(){
        System.out.println("El despegue consumira un 20% del tanque.");
        System.out.println("**Despegando....**");
        setCombustible(-20);
        mostrarEstado();
    }
    
    public void avanzar(){
        System.out.println("Esta nave consume un 1% del tanque cada 100 kms");        
        double distancia;
        double consumo;
        Scanner input = new Scanner(System.in);
        while(true){
            if(getCombustible()<1){        
                System.out.println("GAME OVER. Te has quedado sin combustible y permaneceras perdido en el espacio hasta el fin de tus dias!");
                System.exit(0);                
            }
            System.out.println("Indique la distancia en Kms: ");
            if(input.hasNextInt()){
                distancia = input.nextInt();
                consumo = distancia/100;
                if(consumo<getCombustible()){
                    System.out.println("**Avanzando....**");
                    setCombustible(-consumo);
                    mostrarEstado();
                    panelMando();
                }else{
                    System.out.println("Lo sentimos, el combustible restante no es suficiente para viajar esa distancia");
                    panelMando();
                }
            }else{
                System.out.println("Ingrese una distancia valida.");
            }            
        }    
    }
    
    public void recargar(){
        System.out.println("La estacion de carga mas proxima se encuentra a 300 kms.");
        if(getCombustible()<3){
            System.out.println("DEMASIADO TARDE. No cuentas con combustible suficiente para llegar a la proxima estacion de carga. Disfruta del espacio para siempre...");
            System.exit(0);
        }else{
            this.combustible=100;
            mostrarEstado();
        }    
    }
    
    
    public void eyectar(){
        System.out.println("Eyectando...");
        System.out.println("********");
        System.out.println("*******");
        System.out.println("******");
        System.out.println("*****");
        System.out.println("****");
        System.out.println("R.I.P");
        System.exit(0);
    }
    
    public void panelMando(){
        int opcion;
        Scanner input1 = new Scanner(System.in);
        while(true){
            System.out.println("Selecciona una opcion de vuelo: ");
            System.out.println("[1] Avanzar");
            System.out.println("[2] Repostar ");
            System.out.println("[3] Abandonar la nave");
            if(input1.hasNextInt()){
                opcion=input1.nextInt();
                
                if(opcion<=3 && opcion>0){
                    switch(opcion){
                        case 1:
                            avanzar();
                            break;
                        case 2:
                            recargar();
                            break;
                        case 3:
                            eyectar();
                           
                    }
                }else{System.out.println("Por favor, selecciona una opcion valida");}
            }else{
                System.out.println("Por favor, selecciona una opcion valida");
            }
        }
    }
    
}
    


