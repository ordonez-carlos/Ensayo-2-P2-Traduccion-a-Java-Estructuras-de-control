
package Traducción;

import java.util.Scanner;


public class Ejercicio07 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numero;
            int cantidad = 0;
            int suma = 0;
            
            System.out.println("===== INGRESO DE NÚMEROS POSITIVOS =====");
            System.out.println("Ingrese un número negativo para finalizar.");
            
            while (true) {
                
                System.out.print("Ingrese un número: ");
                numero = entrada.nextInt();
                
                if (numero < 0) {
                    break;
                }
                
                suma = suma + numero;
                cantidad = cantidad + 1;
            }
            
            System.out.println("\n===== RESULTADOS =====");
            System.out.println("Cantidad de números ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
        }
    }
}
