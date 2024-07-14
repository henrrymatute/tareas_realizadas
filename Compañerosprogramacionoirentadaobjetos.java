/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compañerosprogramacionoirentadaobjetos;

/**
 *
 * @author SkyNet
 */
public class Compañerosprogramacionoirentadaobjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("============================================");
        System.out.println("=                                           =");
        System.out.println("=Compañeros programacion orientada a objetos=");
        System.out.println("=                                           =");
        System.out.println("=============================================");
       
        // Definir un arreglo para almacenar los nombres de los compañeros
        String[] nombre = new String[10];

        // Asignar nombres a cada posición del arreglo
        nombre[0] = "Cristy";
        nombre[1] = "Michel";
        nombre[2] = "Jacky";
        nombre[3] = "Ramon";
        nombre[4] = "Teto";
        nombre[5] = "Jorge";
        nombre[6] = "Marta";
        nombre[7] = "Pablo";
        nombre[8] = "Andres";
        nombre[9] = "Pedro";

        // Imprimir los nombres en consola
        System.out.println("Nombres de mis compañeros de clase programacion orientada a objetos:");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println((i + 1) + ". " + nombre[i]);
        }
    }
}

    
