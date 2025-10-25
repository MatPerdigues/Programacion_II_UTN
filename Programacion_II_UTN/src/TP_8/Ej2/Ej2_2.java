
package TP_8.Ej2;

import java.util.Scanner;


public class Ej2_2 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String texto = sc.nextLine();
        try {
            int num = Integer.parseInt(texto);
            System.out.println("Numero: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un numero valido.");
        } 
    }
}

