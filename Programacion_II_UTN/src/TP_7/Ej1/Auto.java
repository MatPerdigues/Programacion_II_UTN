
package TP_7.Ej1;


public final class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    protected Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
    protected void mostrarInfo(){
        System.out.println("Marca: "+super.getMarca()+"; Modelo: "+super.getModelo()+"; Puertas: "+this.cantidadPuertas);
    }
    
    
}
