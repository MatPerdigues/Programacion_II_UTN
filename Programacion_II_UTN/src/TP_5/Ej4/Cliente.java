
package TP_5.Ej4;


public class Cliente {
    private String nombre;
    private int dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, int dni){
        this.nombre=nombre;
        this.dni=dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
    
    public void setTarjetaDeCredito(TarjetaDeCredito tarjeta){
        this.tarjeta=tarjeta;
        if(tarjeta != null && tarjeta.getCliente() != this){
            tarjeta.setCliente(this);
        }
    }
    
    public TarjetaDeCredito getTarjetaDeCredito(){
        return this.tarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
}
