
package TP_4.Ej1;


public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    //Debido a que el total de empleados debe actualizarse de manera automatica no se incluye un setter para este atributo 
    //Al contar con la funcion mostrarTotalEmeplados no se incluye un getter para este atributo
    
      
    public static int mostrarTotalEmpleados(){
        
        return Empleado.totalEmpleados;        
    }   
        
    public Empleado(int id, String nombre, String puesto, double salario){
        if(id>0 && nombre.matches("[a-zA-Z ]+") && puesto.matches("[a-zA-Z ]+") && salario>0){
            this.id=id;
            this.nombre=nombre;
            this.puesto=puesto;
            this.salario=salario;    
            Empleado.totalEmpleados+=1;        
        }else{
            System.out.println("Alguno de los datos ingresados no es válido.");
        }

    }   
    
    public Empleado(String nombre, String puesto){
        if(nombre.matches("[a-zA-Z ]+") && puesto.matches("[a-zA-Z ]+")){
            this.nombre=nombre;
            this.puesto=puesto;
            this.id=Empleado.totalEmpleados;
            this.salario=1800000;
            Empleado.totalEmpleados+=1;
        }else{
            System.out.println("Alguno de los datos ingresados no es válido.");
        }
    }
    
    public void actualizarSalario(double porcentaje){ 
        double aumento = (porcentaje/100)+1;  
        aumento = Math.round(this.salario*aumento * 100.0) / 100.0;
        System.out.println("Salario aumentado en un "+porcentaje+"%= "+(aumento));     
    }
    
    public void actualizarSalario(int monto){       
        System.out.println("Salario aumentado en "+monto+"$= "+(this.salario+monto));
    }  
       
  
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
}
