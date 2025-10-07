
package TP_6.Ej1;


public class Main {
    public static void main(String[] args) {
        Inventario inventario1 = new Inventario();
        Producto product1 = new Producto("1256","Mermelada",6500,25,CategoriaProducto.ALIMENTOS);
        Producto product2 = new Producto("1257","Limpia vidrios",5600,120,CategoriaProducto.HOGAR);
        Producto product3 = new Producto("1258","Auriculares",32520,39,CategoriaProducto.ELECTRONICA);
        Producto product4 = new Producto("1259","Camisa",43200,15,CategoriaProducto.ROPA);
        Producto product5 = new Producto("1260","Campera",75500,12,CategoriaProducto.ROPA);
        
        
        inventario1.agregarProducto(product1);
        inventario1.agregarProducto(product2);
        inventario1.agregarProducto(product3);
        inventario1.agregarProducto(product4);
        inventario1.agregarProducto(product5);
        
        System.out.println("******    listarProductos()    ******");
        System.out.println("");
        inventario1.listarProductos();
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    buscarProductoPorId()    ******");
        System.out.println("");
        inventario1.buscarProductoPorId("1258");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    eliminarProducto()    ******");
        System.out.println("");
        inventario1.eliminarProducto("1259");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    actualizarStock()    ******");
        System.out.println("");
        inventario1.actualizarStock("1257", 63);
        System.out.println("");
        System.out.println("");
        
        System.out.println("******    filtrarPorCategoria    ******");
        System.out.println("");
        inventario1.filtrarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******   obtenerTotalStock()    ******");
        System.out.println("");
        inventario1.obtenerTotalStock();
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    obtenerProductoConMayorStock()    ******");
        System.out.println("");       
        inventario1.obtenerProductoConMayorStock();
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    filtrarProductosPorPrecio()    ******");
        System.out.println("");
        inventario1.filtrarProductosPorPrecio(30000, 45000);
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("******    mostrarCategoriasDisponibles()    ******");
        System.out.println("");     
        inventario1.mostrarCategoriasDisponibles();
        System.out.println("");
        System.out.println("");
        

    }
}
