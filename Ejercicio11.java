
package Traducción;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int mayor;
            int menor;
            
            System.out.println("===== NÚMERO MAYOR Y MENOR =====");
            
            System.out.print("Ingrese el número 1: ");
            numero = entrada.nextInt();
            
            mayor = numero;
            menor = numero;
            
            for (int i = 2; i <= 10; i++) {
                
                System.out.print("Ingrese el número " + i + ": ");
                numero = entrada.nextInt();
                
                if (numero > mayor) {
                    mayor = numero;
                }
                
                if (numero < menor) {
                    menor = numero;
                }
            }
            
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Número mayor: " + mayor);
            System.out.println("Número menor: " + menor);
        }
    }
}
