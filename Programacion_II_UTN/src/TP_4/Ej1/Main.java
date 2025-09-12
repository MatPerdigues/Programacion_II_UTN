
package TP_4.Ej1;

public class Main {
    public static void main(String[] args) {
    
    Empleado empleado1 = new Empleado (1001,"Juan Perez","Gerente Regional",2600000.00);           
    Empleado empleado2 = new Empleado ("Mariano Suarez","Analista");
    Empleado empleado3 = new Empleado ("Carolina Teran","Supervisora");
    Empleado empleado4 = new Empleado (1002,"Ramon Garcia","Cadete",1300000.00); 
    
    
    System.out.println(empleado1);
    empleado1.actualizarSalario(20.0);
    System.out.println(empleado2);
    empleado2.actualizarSalario(35000);
    System.out.println(empleado3);
    empleado3.actualizarSalario(15.0);
    System.out.println(empleado4);
    empleado4.actualizarSalario(25000);
    System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        
        
    
    }
    
    
}

