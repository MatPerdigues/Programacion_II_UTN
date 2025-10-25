
package TP_8.Ej1;


public class TarjetaCredito extends MedioDePago{    

    public TarjetaCredito(double totalCompra) {
        super(totalCompra);        
    }
    
    @Override
    public void informarMedioPago() {
        System.out.println("Medio de pago seleccionado: Tarjeta de Credito");
    }
}
