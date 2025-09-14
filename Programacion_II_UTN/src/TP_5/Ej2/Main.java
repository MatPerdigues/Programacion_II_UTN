
package TP_5.Ej2;


public class Main {
    public static void main(String[] args) {
        Bateria bateria = new Bateria("batPremium", 1000.0);
        Celular celular = new Celular(35451,"SaMsong","S20",bateria);
        Usuario usuario = new Usuario("Martin Gonzales", 28623547);
        celular.setUsuario(usuario);
        celular.verCelular();
    }
}
