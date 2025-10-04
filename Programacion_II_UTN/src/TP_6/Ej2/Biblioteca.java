
package TP_6.Ej2;
import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>(); //se agrega un Array para agrupar los autores y controlar que al momento de listarlos no se repitan.

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn,titulo,anioPublicacion,autor));
        if(!autores.contains(autor)){
            autores.add(autor);
        }
    }
    
    
    public void mostrarAutoresDisponibles(){
        System.out.println(autores);
    }
    
    
    public void listarLibros(){
        for(Libro libro:libros){
            System.out.println(libro);
        }
    }
    
    
    public Libro buscarLibroPorIsbn(String isbn){
        Libro libroEncontrado;
        int i=0;
        int x=0;
        while(i<libros.size() && x==0){                       
            if(this.libros.get(i).getIsbn().equals(isbn)){
                x=1;
                System.out.println("Libro encontrado: "+this.libros.get(i));
                return this.libros.get(i);            }
            i++;
        }
        if(x==0){
            System.out.println("No se ha encontrado un libro con ese ISBN.");
        }        
         return null;   
    }
    
    public void eliminarLibro(String isbn){ 
        Libro libroEliminado = this.buscarLibroPorIsbn(isbn);
        if(libroEliminado!=null){
            this.libros.remove(libroEliminado);
        }
        System.out.println(libros);        
    }
    
    public int obtenerCantidadLibros(){
        int cont = 0;
        for(Libro libro:libros){
            cont ++;
        }
        System.out.println("El total de libros de la Biblioteca es "+cont);
        return cont;
    }
    
}
