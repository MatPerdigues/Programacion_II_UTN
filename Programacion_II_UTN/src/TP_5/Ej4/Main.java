
package TP_5.Ej4;


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Lio","20-12345678-1");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456","25/08/2026",banco);
        Cliente cliente = new Cliente("Jorge Suarez",22365845);
        tarjeta.setCliente(cliente);
        tarjeta.verTarjeta();
    }
}
