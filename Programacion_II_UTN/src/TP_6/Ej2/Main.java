
package TP_6.Ej2;

public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("1121","Santiago Posteguillo","española");
        Autor autor2 = new Autor("1122","Arturo Perez Reverte","española");
        Autor autor3 = new Autor("1123","Miguel Bonasso","argentina");

        Biblioteca biblioteca1 = new Biblioteca("Ateneo");
        
        biblioteca1.agregarLibro("54B8C", "Revolucion", 2020, autor2);
        biblioteca1.agregarLibro("72L5D", "Los Asesinos del Emperador", 2011, autor1);
        biblioteca1.agregarLibro("36J8O", "La venganza de los patriotas", 2005, autor3);
        biblioteca1.agregarLibro("86X5K", "El Husar", 2000, autor2);
        biblioteca1.agregarLibro("43M3N", "Africanus", 2013, autor1);
        
        System.out.println("****** listarLibros() ******");
        System.out.println("");
        biblioteca1.listarLibros();
        System.out.println("");
        
        System.out.println("****** buscarLibroPorIsbn() ******");
        System.out.println("");
        biblioteca1.buscarLibroPorIsbn("54B8C");
        System.out.println("");
        
        System.out.println("****** eliminarLibro() ******");
        System.out.println("");
        biblioteca1.eliminarLibro("54B8C");
        System.out.println("");
        
        System.out.println("****** obtenerCantidadLibros() ******");
        System.out.println("");
        biblioteca1.obtenerCantidadLibros();
        System.out.println("");
        
        System.out.println("****** mostrarAutoresDisponibles() ******");
        System.out.println("");
        biblioteca1.mostrarAutoresDisponibles();

    }
}
