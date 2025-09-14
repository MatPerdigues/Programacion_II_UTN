
package TP_5.Ej13;


public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigoQr = new CodigoQR(valor);
        System.out.println("Codigo QR generado: "+codigoQr.getValor()+", "+usuario);
        
    }
}
