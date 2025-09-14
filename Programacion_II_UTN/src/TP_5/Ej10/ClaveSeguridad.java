
package TP_5.Ej10;


public class ClaveSeguridad {
    private int codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(int codigo, String ultimaModificacion){
        this.codigo=codigo;
        this.ultimaModificacion=ultimaModificacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getUltimaModificacion() {
        return ultimaModificacion;
    }
  

    @Override
    public String toString() {
        return "ClaveSeguridad{" + "codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + '}';
    }
}
