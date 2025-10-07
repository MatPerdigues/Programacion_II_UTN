
package TP_7.Ej5;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
    ArrayList<Pagable> metodos = new ArrayList<>();
    
    metodos.add(new TarjetaCredito());
    metodos.add(new Transferencia());
    metodos.add(new Efectivo());
 
    
    for(Pagable pagable : metodos){
        procesarPago(pagable);
    }
}
    
    public static void procesarPago(Pagable metodo){
        metodo.pagar();
    }
    
}
    




