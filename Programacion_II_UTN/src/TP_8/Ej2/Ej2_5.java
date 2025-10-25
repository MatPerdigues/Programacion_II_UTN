
package TP_8.Ej2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2_5 {
    public static void main(String[] args) {
        String rutaArchivo = "C:/Users/TheBlackBox/Desktop/prueba_ej3.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
