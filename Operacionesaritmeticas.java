/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacionesaritmeticas;

/**
 *
 * @author SkyNet
 */
public class Operacionesaritmeticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("============================================");
        System.out.println("=                                           =");
        System.out.println("=        Operaciones aritmeticas            =");
        System.out.println("=                                           =");
        System.out.println("=============================================");
        
        // Definir dos números enteros
        int numero1 = 75;
        int numero2 = 2;
        
        // Realizar las operaciones aritméticas
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;
      
        // Imprimir los resultados en consola
        System.out.println("Operaciones aritméticas entre " + numero1 + " y " + numero2);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);
    }
    
}
