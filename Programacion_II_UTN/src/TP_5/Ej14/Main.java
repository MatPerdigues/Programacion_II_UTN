
package TP_5.Ej14;


public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("El lado oscuro del sol",97.5);
        Render render = new Render(".mp4");
        render.setProyecto(proyecto);
        render.mostrarRender();
        
        EditorVideo editor = new EditorVideo();
        editor.exportar("MOV", proyecto);
    }
}
