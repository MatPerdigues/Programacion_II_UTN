
package TP_3;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("****EJERCICIO 1****");
        System.out.println("");
        
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Javier");
        estudiante1.setApellido("Ramirez");
        estudiante1.setCurso("Economia");
        estudiante1.setCalificacion(7);
        estudiante1.mostrarInfo();
        estudiante1.subirCalificacion();
        estudiante1.bajarCalificacion();
        
        System.out.println("");
        System.out.println("****EJERCICIO 2****");
        System.out.println("");
        
        Mascota mascota1 = new Mascota();
        mascota1.setNombre("Pelusa");
        mascota1.setEspecie("Gato");
        mascota1.setEdad(11);
        mascota1.mostrarInfo();
        mascota1.cumplirAnios();
        
        System.out.println("");
        System.out.println("****EJERCICIO 3****");
        System.out.println("");
        
        Libro libro1 = new Libro();
        libro1.setAnioPublicacion();
        
        
        System.out.println("");
        System.out.println("****EJERCICIO 4****");
        System.out.println("");
        
        Gallina gallina1 = new Gallina();
        gallina1.setIdGallina(1596);
        gallina1.setEdad(7);
        gallina1.setHuevosPuestos(1540);
        gallina1.mostrarEstado();
        gallina1.envejecer();
        
        System.out.println("");
        
        Gallina gallina2 = new Gallina();
        gallina2.setIdGallina(2374);
        gallina2.setEdad(4);
        gallina2.setHuevosPuestos(880);
        gallina2.mostrarEstado();
        gallina2.envejecer();
        
        System.out.println("");
        System.out.println("****EJERCICIO 5****");
        System.out.println("");
        
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setNombre("Apollo_11");
        nave1.setCombustible(50);
        nave1.despegar();
        nave1.panelMando();
    }
    
}
