
package TP_5.Ej12;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Contribuyente contribuyente = new Contribuyente("Joaco Lorado",2065658745);
        Impuesto impuesto = new Impuesto(125326.0);
        impuesto.setContribuyente(contribuyente);
        impuesto.verImpuesto();
        calculadora.calcular(impuesto);
    }
}
