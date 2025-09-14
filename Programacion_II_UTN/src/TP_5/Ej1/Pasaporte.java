
package TP_5.Ej1;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;
    private Titular titular;
    
    public Pasaporte(String numero, String fechaEmision, String foto, String formato){
        this.numero=numero;
        this.fechaEmision=fechaEmision;
        this.foto=new Foto(foto,formato);
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public String getFechaEmision(){
        return this.fechaEmision;
    }     

    
    public void setTitular(Titular titular){
        this.titular=titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular(){
        return this.titular;
    }
    
    public void mostrarPasaporte(){
        if(foto !=null && titular != null){
            System.out.println("Pasaporte: "+this.numero+" "+this.foto+" "+titular); 
        }else{
            System.out.println("El pasaporte no tiene foto.");
        }
    }
    
}
