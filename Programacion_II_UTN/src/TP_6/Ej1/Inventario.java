
package TP_6.Ej1;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    
    
    public Inventario() {
        this.productos = new ArrayList<>();
    }
        

    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
        
    public void listarProductos(){
        for(Producto producto:productos){
            System.out.println(producto);
        }
    }
    
        
    public Producto buscarProductoPorId(String id){
        Producto prodEncontrado;
        int i=0;
        int x=0;
        while(i<productos.size() && x==0){                       
            if(this.productos.get(i).getID().equals(id)){
                x=1;
                System.out.println("Producto encontrado: "+this.productos.get(i));
                return this.productos.get(i);            }
            i++;
        }
        if(x==0){
            System.out.println("No existe un producto con ese ID.");
        }        
         return null;   
    }

        
    public Producto eliminarProducto(String id){
        Producto prodEliminado = this.buscarProductoPorId(id);
        if(prodEliminado!=null){
            this.productos.remove(prodEliminado);
        }
        System.out.println(productos);
        return prodEliminado; 
    }
    
        
    public Producto actualizarStock(String id, int nuevaCantidad){
        Producto prodActualizado = this.buscarProductoPorId(id);
        if(prodActualizado!=null){
            prodActualizado.setCantidad(nuevaCantidad);
        }
        System.out.println(productos);
        return prodActualizado;
    }

    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> prodsCategoria = new ArrayList<>();
        for(Producto producto:productos){
            if(producto.getCategoria() == categoria){
                prodsCategoria.add(producto);
            }
        }
        System.out.println(prodsCategoria);
        return prodsCategoria;
    }
    
    
    public int obtenerTotalStock(){
        int acum = 0;
        for(Producto producto:productos){
            acum += producto.getCantidad();
        }
        System.out.println("El stock total del inventario es de "+acum+" unidades.");
        return acum;
    }
    
    
    public ArrayList<Producto> obtenerProductoConMayorStock(){
        int max = -1;
        ArrayList<Producto> prodsMaxStock = new ArrayList<>();        
        for(Producto producto:productos){
            if(producto.getCantidad()>max){
                max=producto.getCantidad();
                prodsMaxStock.clear();
                prodsMaxStock.add(producto);      
            }else if(producto.getCantidad()==max){
                prodsMaxStock.add(producto);
            }
        }
        System.out.println(prodsMaxStock);
        return prodsMaxStock;
    }
    
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> prodsPrecio = new ArrayList<>();
        for(Producto producto:productos){
            if(producto.getPrecio()>=min && producto.getPrecio()<=max){
                prodsPrecio.add(producto);
            }
        }
        System.out.println(prodsPrecio);
        return prodsPrecio;
    }
    
    
   public void mostrarCategoriasDisponibles(){
        for(CategoriaProducto categoria: CategoriaProducto.values()){
            System.out.println("Categoria: "+categoria.name()+". Descricpcion: "+categoria.getDescripcion());
        }
   }
    

}
