
package TP_5.Ej10;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;
    
    public CuentaBancaria(String cbu, double saldo, int codigo, String ultimaModificacion){
        this.cbu=cbu;
        this.saldo=saldo;
        this.claveSeguridad=new ClaveSeguridad(codigo,ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public void setTitular(Titular titular){
        this.titular=titular;
        if(titular != null && titular.getCuentaBancaria() != this){
            titular.setCuentaBancaria(this);
        }
    }
    
    public Titular getTitular(){
        return this.titular;
    }
    
    
    public void verCuentaBancaria(){
        System.out.println("CBU: "+this.cbu+", Saldo: "+this.saldo+", "+claveSeguridad+", "+titular);
    }
    
}
