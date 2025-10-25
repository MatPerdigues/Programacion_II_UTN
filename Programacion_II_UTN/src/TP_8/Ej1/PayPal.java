
package TP_8.Ej1;


public class PayPal extends MedioDePago{

    public PayPal(double totalCompra) {
        super(totalCompra);
    }
    
    
    @Override
    public void informarMedioPago() {
        System.out.println("Medio de pago seleccionado: Pay Pal");
    }

    @Override
    public void aplicarDescuento(double totalCompra) {
        System.out.println("El descuento no es aplicable.");
    }

    
    

    
    
    
}
