
package TP_5.Ej6;


public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(2,4);
        Cliente cliente = new Cliente("Elisa Pofeo",38652415);
        Reserva reserva = new Reserva("17/07/2025","20.30",mesa);
        reserva.setCliente(cliente);
        reserva.mostrarReserva();
    }
}
