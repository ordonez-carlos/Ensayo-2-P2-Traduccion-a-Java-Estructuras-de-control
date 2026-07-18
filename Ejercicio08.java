
package Traducción;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) {
            String contrasena;
            String contrasenaCorrecta = "java2026";
            
            System.out.println("===== VALIDACIÓN DE CONTRASEÑA =====");
            
            do {
                System.out.print("Ingrese la contraseña: ");
                contrasena = entrada.nextLine();
                
                if (!contrasena.equals(contrasenaCorrecta)) {
                    System.out.println("Contraseña incorrecta. Intente nuevamente.");
                }
                
            } while (!contrasena.equals(contrasenaCorrecta));
            
            System.out.println("Acceso concedido.");
        }
    }
}
