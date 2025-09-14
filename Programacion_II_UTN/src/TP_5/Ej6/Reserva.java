
package TP_5.Ej6;


public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;
    
    public Reserva(String fecha, String hora, Mesa mesa){
        this.fecha=fecha;
        this.hora=hora;
        this.mesa=mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    
    public void mostrarReserva(){
        System.out.println("Fecha: "+this.fecha+" Hora: "+hora+" "+cliente+" "+mesa);
    }
    
}
