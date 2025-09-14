
package TP_5.Ej5;


public class Computadora {
    private String marca;
    private int numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    public Computadora(String marca, int numeroSerie,String modeloPlaca,String chipsetPlaca){
        this.marca=marca;
        this.numeroSerie=numeroSerie;
        this.placaMadre=new PlacaMadre(modeloPlaca,chipsetPlaca);
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }
    
    public void verComputadora(){
        System.out.println("Marca: "+this.marca+", Numero de serie: "+this.numeroSerie+" "+placaMadre+" "+propietario);
    }
    
    public void setPropietario(Propietario propietario){
        this.propietario=propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public Propietario getPropietario(){
        return this.propietario;
    }
    
}
