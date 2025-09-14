
package TP_5.Ej14;


public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }
    
    public void setProyecto(Proyecto proyecto){
        this.proyecto=proyecto;
    }
    
    public void mostrarRender(){
        System.out.println(proyecto+", Formato: "+this.formato);
    }
}
