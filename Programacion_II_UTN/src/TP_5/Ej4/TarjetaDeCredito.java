
package TP_5.Ej4;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;
    
    public TarjetaDeCredito(String numero,String fechaVencimiento,Banco banco){
        this.numero=numero;
        this.fechaVencimiento=fechaVencimiento;
        this.banco=banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void verTarjeta(){
        System.out.println("Tarjeta: "+this.numero+" Vto: "+fechaVencimiento+" "+cliente+" "+banco);
    }
}
