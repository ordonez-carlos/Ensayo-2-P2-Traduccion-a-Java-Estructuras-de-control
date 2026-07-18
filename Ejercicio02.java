
package Traducción;

import java.util.Scanner;

public class Ejercicio02 {
    
     public static void main(String[] args) {

         try (Scanner entrada = new Scanner(System.in)) {
             int numero1;
             int numero2;
             int suma;
             int resta;
             int multiplicacion;
             
             System.out.println("===== OPERACIONES MATEMÁTICAS =====");
             
             System.out.print("Ingrese el primer número entero: ");
             numero1 = entrada.nextInt();
             
             System.out.print("Ingrese el segundo número entero: ");
             numero2 = entrada.nextInt();
             
             suma = numero1 + numero2;
             resta = numero1 - numero2;
             multiplicacion = numero1 * numero2;
             
             System.out.println("\n===== RESULTADOS =====");
             System.out.println("Suma: " + suma);
             System.out.println("Resta: " + resta);
             System.out.println("Multiplicación: " + multiplicacion);
             
             if (numero2 != 0) {
                 
                 double division = (double) numero1 / numero2;
                 int residuo = numero1 % numero2;
                 
                 System.out.println("División: " + division);
                 System.out.println("Residuo: " + residuo);
                 
             } else {
                 
                 System.out.println("División: No se puede dividir para cero.");
                 System.out.println("Residuo: No se puede calcular con divisor cero.");
             }}
    }
}

