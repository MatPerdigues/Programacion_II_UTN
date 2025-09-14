
package TP_5.Ej8;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Martin Glado","tinglado@gmail.com");
        Documento documento = new Documento("Titulo del documento","Contenido del documento","e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b85","24/11/2019",usuario);
        documento.verDocumento();
    }
}
