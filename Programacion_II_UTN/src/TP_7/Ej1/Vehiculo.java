
package TP_7.Ej1;


public abstract class Vehiculo {
    private String marca;
    private String modelo;

    protected Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }    
    
    
    protected void mostrarInfo(){
        System.out.println("Marca: "+this.marca+"; Modelo: "+this.modelo); 
    }

    
}
