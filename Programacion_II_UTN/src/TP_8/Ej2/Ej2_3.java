
package TP_8.Ej2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej2_3 {
     public static void main(String[] args) {
     
     Scanner scan = null;
        try {
            File archivo = new File("C:/Users/TheBlackBox/Desktop/prueba_ej3.txt");
            scan = new Scanner(archivo);
            while (scan.hasNextLine()) {
                String linea = scan.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: No se encontró el archivo.");
        } finally {
            if (scan != null) {
                scan.close();
            }
        }
     }
}
