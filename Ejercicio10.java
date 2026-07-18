
package Traducción;

import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            double promedio;
            
            System.out.println("===== SUMA Y PROMEDIO =====");
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el número " + i + ": ");
                numero = entrada.nextInt();
                
                suma = suma + numero;
            }
            
            promedio = (double) suma / 10;
            
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
