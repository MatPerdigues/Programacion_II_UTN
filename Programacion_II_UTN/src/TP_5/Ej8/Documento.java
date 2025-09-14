
package TP_5.Ej8;


public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    
    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario){
        this.titulo=titulo;
        this.contenido=contenido;
        this.firmaDigital=new FirmaDigital(codigoHash,fecha,usuario);
       
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }
    
    public void verDocumento(){
        System.out.println("Titulo: "+this.titulo+", Contenido: "+this.contenido+", "+firmaDigital);
    }
    
    
}
