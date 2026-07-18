
package Traducción;

import java.util.Scanner;


public class Ejercicio05 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            double calificacion;
            
            System.out.println("===== CLASIFICACIÓN DE CALIFICACIÓN =====");
            
            System.out.print("Ingrese una calificación entre 0 y 10: ");
            String calificacionTexto = entrada.nextLine();
            
            // Permite ingresar decimales con punto o coma.
            calificacionTexto = calificacionTexto.replace(",", ".");
            calificacion = Double.parseDouble(calificacionTexto);
            
            if (calificacion < 0 || calificacion > 10) {
                System.out.println("La calificación ingresada no es válida.");
            } else if (calificacion >= 9) {
                System.out.println("Excelente");
            } else if (calificacion >= 8) {
                System.out.println("Muy Bueno");
            } else if (calificacion >= 7) {
                System.out.println("Bueno");
            } else if (calificacion >= 5) {
                System.out.println("Regular");
            } else {
                System.out.println("Deficiente");
            }
        }
    }
}
