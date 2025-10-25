
package TP_8.Ej2;

import java.util.Scanner;


public class Ej2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {            
            System.out.print("Ingrese el dividendo: ");
            int dividendo = sc.nextInt();
            System.out.print("Ingrese el divisor: ");
            int divisor = sc.nextInt();           
            int res = dividendo / divisor;
            System.out.println("Resultado: " + res);

        } catch (ArithmeticException e) {            
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}

