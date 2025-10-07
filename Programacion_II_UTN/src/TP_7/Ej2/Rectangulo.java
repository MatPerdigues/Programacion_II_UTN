
package TP_7.Ej2;


public final class Rectangulo extends Figura{
    private double base;
    private double altura;
    protected Rectangulo(String nombre, double base, double altura){
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    protected void calcularArea() {
        System.out.println("Area de "+super.getNombre()+": "+base*altura);
    }
    
    
}
