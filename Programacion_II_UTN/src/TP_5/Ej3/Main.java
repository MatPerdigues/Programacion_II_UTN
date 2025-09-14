
package TP_5.Ej3;


public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Alfaguada","Viamonte 430");
        Libro libro = new Libro("La sombra del aguila","978-950-563-656-3",editorial);
        Autor autor = new Autor("Arturo Perez Reverte","española");
        libro.setAutor(autor);
        libro.verLibro();      
    }
}
