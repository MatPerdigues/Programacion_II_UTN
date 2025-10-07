
package TP_7.Ej4;

public abstract class Animal {
    
    protected abstract void hacerSonido();
    
    protected void describirAnimal(){
        System.out.println("Especie: "+this.getClass().getSimpleName());
    }
}
