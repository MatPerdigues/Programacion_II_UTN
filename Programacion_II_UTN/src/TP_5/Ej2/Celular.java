
package TP_5.Ej2;


public class Celular {
    private int imei;
    private String marca;
    private String modelo;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(int imei, String marca, String modelo, Bateria bateria){
        this.imei=imei;
        this.marca=marca;
        this.modelo=modelo;
        this.bateria=bateria;
    }

    public int getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario=usuario;
        if(usuario!=null && usuario.getCelular()!=this){
            usuario.setCelular(this);
        }
    }
    
    public Usuario getUsuario(){
        return this.usuario;
    }
    
       
    public void verCelular(){
        System.out.println("imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + " " + bateria + usuario);
    }    
    
    
    
    
}
