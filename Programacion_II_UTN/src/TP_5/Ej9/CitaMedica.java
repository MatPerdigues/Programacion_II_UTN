
package TP_5.Ej9;


public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;
    
    public CitaMedica(String fecha, String hora){
        this.fecha=fecha;
        this.hora=hora;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }
    
    public void setPaciente(Paciente paciente){
        this.paciente=paciente;
    }
    
    public void setProfesional(Profesional profesional){
        this.profesional=profesional;
    }
    
    public void verCita(){
        System.out.println("Fecha: "+this.fecha+", Hora: "+this.hora+" "+paciente+" "+profesional);
    }
}
