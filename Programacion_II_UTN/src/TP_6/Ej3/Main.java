
package TP_6.Ej3;

public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UTN");
        
        Profesor profesor1 = new Profesor("2653","Elza Pato","Ingeniería");
        Profesor profesor2 = new Profesor("2654","Santiago Lazo","Estadística");
        Profesor profesor3 = new Profesor("2655","Camila Garto","Programacion");
        
        Curso ingenieria = new Curso ("26","Ingenieria Civil");
        Curso estadistica = new Curso("27","Estadística");
        Curso programacion = new Curso("28","Programación");
        Curso baseDatos = new Curso("29","Base de Datos");
        Curso SistOperativos = new Curso("30","Sistemas Operativos");
        
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        
        universidad.agregarCurso(ingenieria);
        universidad.agregarCurso(estadistica);
        universidad.agregarCurso(programacion);
        universidad.agregarCurso(baseDatos);
        universidad.agregarCurso(SistOperativos);
        
        universidad.asignarProfesorACurso("26","2653");
        universidad.asignarProfesorACurso("27","2654");
        universidad.asignarProfesorACurso("28","2655");
        universidad.asignarProfesorACurso("29","2653");
        universidad.asignarProfesorACurso("30","2655");
        
        
        System.out.println("*** Cursos ***");
        universidad.listarCursos();
        System.out.println("");
        
        System.out.println("*** Profesores ***");
        universidad.listarProfesores();
        System.out.println("");
        
        System.out.println("*** Nuevo profesor ***");
        universidad.asignarProfesorACurso("30", "2654");
        universidad.listarCursos();
        System.out.println("");
        
        System.out.println("*** Cursos del nuevo profesor ***");
        profesor2.listarCursos();
        System.out.println("");
        
        System.out.println("*** Curso removido ***");
        universidad.eliminarCurso("30"); // incluye un sout de cursos por lo que la info se ve duplicada junto a listarCursos();
        profesor2.listarCursos();
        System.out.println("");
        
        System.out.println("*** Profesor removido ***");
        universidad.eliminarProfesor("2655");
        System.out.println("");
        
        System.out.println("*** Cursos actualizados ***");
        universidad.listarCursos();
        System.out.println("");
                
        System.out.println("*** Reporte ***");
        universidad.mostrarReporte();
        
    }
}
