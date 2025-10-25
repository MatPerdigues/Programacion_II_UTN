
package TP_8.Ej2;

import java.util.Scanner;


public class Ej2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        try {
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Ingrese una edad valida");
            }
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}

