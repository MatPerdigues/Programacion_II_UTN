
package TP_5.Ej8;


public class FirmaDigital {
    private String codigoHash;
    private String fecha;
    private Usuario usuario;
    
    public FirmaDigital(String codigoHash, String fecha,Usuario usuario){
        this.codigoHash=codigoHash;
        this.fecha=fecha;
        this.usuario=usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public String getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "FirmaDigital{" + "codigoHash=" + codigoHash + ", fecha=" + fecha + ", " + usuario + '}';
    }


    
    
}
