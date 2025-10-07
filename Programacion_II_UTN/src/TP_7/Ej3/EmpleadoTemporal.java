
package TP_7.Ej3;


public class EmpleadoTemporal extends Empleado{
    private final static double SUELDO_BASE_DIA = 65000;
    private int diasTrabajados;
    
    protected EmpleadoTemporal(String nombre, int diasTrabajados){
        super(nombre);
        this.diasTrabajados = diasTrabajados;
    }

    @Override
    protected void calcularSueldo() {
        String nombreEmpleado = super.getNombre();
        double sueldoNeto = this.diasTrabajados * SUELDO_BASE_DIA;
        System.out.println("Empleado: "+nombreEmpleado+"; Sueldo: "+sueldoNeto);
        
    }
}
