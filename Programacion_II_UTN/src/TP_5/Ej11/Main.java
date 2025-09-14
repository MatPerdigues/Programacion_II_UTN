
package TP_5.Ej11;

public class Main {
   public static void main(String[] args) {
       Artista artista = new Artista("Radiohead","Rock");
       Cancion cancion = new Cancion("Fake Plastic Trees");
       Reproductor reproductor = new Reproductor();
       cancion.setArtista(artista);       
       reproductor.reproducir(cancion);
       cancion.escucharCancion();
       
   } 
}
