
package TP_5.Ej10;


public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Santiago Laso",30526854);
        CuentaBancaria cuentaBancaria = new CuentaBancaria("2365545661198",789623.0,6584,"15/08/2025");
        cuentaBancaria.setTitular(titular);
        cuentaBancaria.verCuentaBancaria();
    }
}
