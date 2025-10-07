
package TP_7.Ej5;


public class Efectivo implements Pagable{

    @Override
    public void pagar() {
        System.out.println("El pago fue realizado en efectivo.");
    }
    
}
