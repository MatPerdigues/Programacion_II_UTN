
package TP_5.Ej7;

public class Main {
    public static void main(String[] args) {
        Conductor conductor = new Conductor("Ramiro Arguello","B2");
        Motor motor = new Motor("Carburacion",1255624563);
        Vehiculo vehiculo = new Vehiculo("Ford Mondeo","A028JKL",motor);
        vehiculo.setConductor(conductor);
        vehiculo.verVehiculo();
    }
}
