
package TP_7.Ej3;


public class EmpleadoPlanta extends Empleado{    
    private final static double SUELDO_BASE_MES = 2200000;
    private final static double ADICIONAL_DESEMPENO = SUELDO_BASE_MES * 0.25;
    private final static double DESC_OBRA_SOCIAL = SUELDO_BASE_MES * 0.03;
    private final static double DESC_JUBILACION = SUELDO_BASE_MES * 0.11;
    private final static double DESC_INASISTENCIA = SUELDO_BASE_MES * 0.03;
    private boolean adicional;
    private int inasistencias;
    
    protected EmpleadoPlanta(String nombre, int inasistencias, boolean adicional){
        super(nombre);
        this.inasistencias = inasistencias;
        this.adicional = adicional;
    }


    @Override
    protected void calcularSueldo() {        

        String nombreEmpleado = super.getNombre();
        double sueldoNeto; 
        double descInasistencia;
        double sumaAdicional;
        int diasInasistencias = this.inasistencias;
                
        if(diasInasistencias>0){
            descInasistencia = DESC_INASISTENCIA * diasInasistencias;
        }else{
            descInasistencia = 0;
        }
        
        if(this.adicional){
            sumaAdicional = ADICIONAL_DESEMPENO;
        }else{
            sumaAdicional = 0;
        }        
        sueldoNeto = SUELDO_BASE_MES - DESC_JUBILACION - DESC_OBRA_SOCIAL - descInasistencia + sumaAdicional;

        
        System.out.println("Empleado: "+nombreEmpleado+"; Sueldo: "+sueldoNeto);
    }
}
