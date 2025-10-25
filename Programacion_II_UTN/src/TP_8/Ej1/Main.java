
package TP_8.Ej1;


public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Marisa Balo","1563658754","mbalo@gmail.com");
        Producto mermelada = new Producto("mermelada",3625.00);
        Producto manteca = new Producto("manteca",5960.00);
        Pedido pedido1 = new Pedido(cliente1);        
        
        pedido1.agregarProducto(mermelada);
        pedido1.agregarProducto(manteca);
        pedido1.calcularTotal();
        TarjetaCredito tarjeta1 = new TarjetaCredito(pedido1.calcularTotal());
        //PayPal paypal1 = new PayPal(pedido1.calcularTotal());
        pedido1.iniciarPago(tarjeta1);
        pedido1.notificarCliente();
    
    }
}
