
package TP_5.Ej13;


public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void mostrarCodigo(){
        System.out.println("Valor: "+this.valor+", "+usuario);
    }
}
