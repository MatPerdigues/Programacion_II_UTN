
package TP_5.Ej14;


public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato);
        System.out.println("Video Renderizado: "+proyecto+", Formato: "+render.getFormato());
        
    }
    
}
