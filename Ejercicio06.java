
package Traducción;

import java.util.Scanner;


public class Ejercicio06 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            int numeroDia;
            
            System.out.println("===== DÍA DE LA SEMANA =====");
            
            System.out.print("Ingrese un número del 1 al 7: ");
            numeroDia = entrada.nextInt();
            
            switch (numeroDia) {
                case 1 -> System.out.println("Lunes");
                    
                case 2 -> System.out.println("Martes");
                    
                case 3 -> System.out.println("Miércoles");
                    
                case 4 -> System.out.println("Jueves");
                    
                case 5 -> System.out.println("Viernes");
                    
                case 6 -> System.out.println("Sábado");
                    
                case 7 -> System.out.println("Domingo");
                    
                default -> System.out.println("Número no válido. Debe ingresar un número del 1 al 7.");
            }
        }
    }
}
