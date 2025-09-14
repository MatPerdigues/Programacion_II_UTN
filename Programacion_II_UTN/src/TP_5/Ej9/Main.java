
package TP_5.Ej9;


public class Main {
    public static void main(String[] args) {
        Profesional profesional = new Profesional("Gaston Elada","Medicina Clinica");
        Paciente paciente = new Paciente("Elsa Blaso","OSDE");
        CitaMedica citaMedica = new CitaMedica("15/10/2025","19.00");
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(profesional);
        citaMedica.verCita();
    }
}
