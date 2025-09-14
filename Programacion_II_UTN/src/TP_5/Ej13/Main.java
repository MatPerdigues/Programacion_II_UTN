
package TP_5.Ej13;


public class Main {
   public static void main(String[] args) {
       Usuario usuario = new Usuario("Gustavo Racho","racho@hotmail.com");
       CodigoQR codigo = new CodigoQR("e513v518b51648m648");
       codigo.setUsuario(usuario);
       codigo.mostrarCodigo();
       
       GeneradorQR generador = new GeneradorQR();
       generador.generar("f46846h84684g9884e6484b8486",usuario);
   } 
}
