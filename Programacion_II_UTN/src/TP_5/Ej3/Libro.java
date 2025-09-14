
package TP_5.Ej3;


public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;
    
    public Libro(String titulo, String isbn, Editorial editorial){
        this.titulo=titulo;
        this.isbn=isbn;
        this.editorial=editorial;
    }   

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAutor(Autor autor){
        this.autor=autor;
    }
    
    public void verLibro(){
        System.out.println("Titulo: "+this.titulo+" isbn: "+this.isbn+" "+autor+" "+editorial);
    }
    
}
