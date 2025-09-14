
package TP_5.Ej1;

public class Main {
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("AAI238844","17/07/2023","foto_Pasaporte",".jpg");
        Titular titular = new Titular("Ricardo Nicolino", 17598325);
        pasaporte.setTitular(titular);
        pasaporte.mostrarPasaporte();

    }
    
}
