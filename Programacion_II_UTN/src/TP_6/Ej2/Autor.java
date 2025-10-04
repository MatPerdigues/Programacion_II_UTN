
package TP_6.Ej2;


public class Autor {
    private String id;
    private String nombre;
    private String nacionaliada;

    public Autor(String id, String nombre, String nacionaliada) {
        
        this.id = id;
        this.nombre = nombre;
        this.nacionaliada = nacionaliada;
        
    }

        
    @Override
    public String toString() {
        return "Autor{" + "id=" + id + ", nombre=" + nombre + ", nacionaliada=" + nacionaliada + '}';
    }
         
    
    public void mostrarInfo(){
        System.out.println(this);
    }
    
}
