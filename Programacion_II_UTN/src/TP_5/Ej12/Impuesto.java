
package TP_5.Ej12;


public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;

    public Impuesto(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
    
    public void setContribuyente(Contribuyente contribuyente){
        this.contribuyente=contribuyente;
    }
    
    public void verImpuesto(){
        System.out.println("Monto: "+this.monto+", "+contribuyente);
    }
}
