
package Traducción;

import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            double nota;
            
            System.out.println("===== CALIFICACIÓN DEL ESTUDIANTE =====");
            
            System.out.print("Ingrese la nota del estudiante: ");
            String notaTexto = entrada.nextLine();
            
            // Permite ingresar la nota con punto o coma.
            notaTexto = notaTexto.replace(",", ".");
            nota = Double.parseDouble(notaTexto);
            
            if (nota >= 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}

