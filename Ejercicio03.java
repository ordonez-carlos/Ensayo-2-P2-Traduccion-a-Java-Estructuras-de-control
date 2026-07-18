
package Traducción;

import java.util.Scanner;

public class Ejercicio03 {
    
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int edad;
            
            System.out.println("===== MAYORÍA DE EDAD =====");
            
            System.out.print("Ingrese su edad: ");
            edad = entrada.nextInt();
            
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }
        }
    }
}

