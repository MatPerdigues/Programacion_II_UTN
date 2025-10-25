
package TP_8.Ej1;

public abstract class MedioDePago implements Pago, PagoConDescuento{
    private double totalCompra;

    public MedioDePago(double totalCompra) {
        this.totalCompra = totalCompra;    }

    public double getTotalCompra() {
        return totalCompra;
    }      
    
    public abstract void informarMedioPago();

}
