
package TP_8.Ej1;


public interface Pago {
    default void procesarPago(double totalCompra){
        System.out.println("Procesando el pago por un total de: " + totalCompra);
    };    
}
