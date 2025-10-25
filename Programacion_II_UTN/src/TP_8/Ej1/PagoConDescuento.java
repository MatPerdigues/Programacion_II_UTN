
package TP_8.Ej1;

public interface PagoConDescuento {        
    default void aplicarDescuento(double totalCompra){
        System.out.println("El precio final con un 10% de descuento es: " + totalCompra * 0.90);
    };
    
}

