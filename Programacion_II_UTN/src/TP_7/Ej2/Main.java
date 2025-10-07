
package TP_7.Ej2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo("circulo1",2));
        figuras.add(new Rectangulo("rectangulo1",2,3));
        figuras.add(new Circulo("circulo2",3));
        figuras.add(new Rectangulo("rectangulo2",4,2));
        
        for(Figura figura : figuras){
            figura.calcularArea();
        }
        
    }
}
