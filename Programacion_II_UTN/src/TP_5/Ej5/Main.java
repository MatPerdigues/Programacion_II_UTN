
package TP_5.Ej5;


public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Asus",123548648,"Micro-ATX","Z690");
        Propietario propietario = new Propietario("Esteban Quito",25695325);
        computadora.setPropietario(propietario);
        computadora.verComputadora();
    }
}
