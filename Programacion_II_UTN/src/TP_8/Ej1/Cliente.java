
package TP_8.Ej1;


public class Cliente implements Notificable{
    private String nombre;
    private String telefono;
    private String email;

    public Cliente(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void notificar() {
        System.out.println(this.email + ": El estado de su pedido se ha actualizado.");
    }
}
