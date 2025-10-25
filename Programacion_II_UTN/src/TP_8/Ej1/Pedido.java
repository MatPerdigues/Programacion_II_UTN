
package TP_8.Ej1;

import TP_8.Ej1.Producto;
import java.util.ArrayList;


public class Pedido implements Pagable{
    private ArrayList<Producto> listaProductos;
    private Cliente cliente;

    public Pedido(Cliente cliente) {
        this.listaProductos = new ArrayList<>();
        this.cliente = cliente;
    }
    
    protected void agregarProducto(Producto producto){
        this.listaProductos.add(producto);
    }
    
    
    protected void iniciarPago(MedioDePago medioPago){
        medioPago.informarMedioPago();
        medioPago.procesarPago(medioPago.getTotalCompra());
        medioPago.aplicarDescuento(medioPago.getTotalCompra());
    }
    
    
    protected void notificarCliente(){        
        this.cliente.notificar();
    }
        
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : listaProductos){
            total += producto.calcularTotal();

        } 
        System.out.println("El total del pedido es: "+total);
        
        return total;
    }
    
  




    
    
    
}
