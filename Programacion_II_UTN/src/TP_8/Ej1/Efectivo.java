
package TP_8.Ej1;


public class Efectivo extends MedioDePago implements Pago, PagoConDescuento{

    public Efectivo(double totalCompra) {
        super(totalCompra);
    }

    @Override
    public void informarMedioPago() {
        System.out.println("Medio de pago seleccionado: Efectivo");
    }
    
}
