
package TP_7.Ej3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Graciela Mentabble",0,true));
        empleados.add(new EmpleadoTemporal("Elisa Lamin",21));
        empleados.add(new EmpleadoPlanta("Felipe Ligroso",2,false));
        empleados.add(new EmpleadoPlanta("Pedro Medario",1,true));
        empleados.add(new EmpleadoTemporal("Camila Angosta",23));
        
        
        for(Empleado empleado : empleados){
            if (empleado instanceof EmpleadoPlanta){
                System.out.println("**** EMPLEADO DE PLANTA ****");
                empleado.calcularSueldo();
                System.out.println("");
            }else{
                System.out.println("**** EMPLEADO TEMPORAL ****");
                empleado.calcularSueldo();
                System.out.println("");
            }
        }
        
    }
}
