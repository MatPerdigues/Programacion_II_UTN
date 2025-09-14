
package TP_5.Ej11;


public class Cancion {
    private String titulo;
    private Artista artista;
    
    public Cancion (String titulo){
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public void setArtista(Artista artista){
        this.artista=artista;
    }
    
    public void escucharCancion(){
        System.out.println("Titulo: "+this.titulo+", "+artista);
    }
    
    
}
