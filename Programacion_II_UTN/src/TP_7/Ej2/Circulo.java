
package TP_7.Ej2;


public final class Circulo extends Figura {
    private double radio;
    
    protected Circulo(String nombre,double radio){
        super(nombre);
        this.radio = radio;
    }

    @Override
    protected void calcularArea(){
         System.out.println("Area de "+super.getNombre()+": "+Math.PI * Math.pow(radio, 2));
    }
}


