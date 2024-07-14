/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datospersonalescompañeros;

/**
 *
 * @author SkyNet
 */
public class Datospersonalescompañeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================");
        System.out.println("=                =");
        System.out.println("=Datos Personales=");
        System.out.println("=                =");
        System.out.println("==================");
// Definimos un arreglo multidimensional para almacenar los datos personales
        String[][] compañeros = {
            {"Juan", "Pérez", "Ingeniería", "Azucarera Chumbagua"},
            {"Ana", "García", "Medicina", "Hospital Mario Catarino Rivas"},
            {"Carlos", "López", "Derecho", "Bufete Rojas Asociados"},
            {"María", "González", "Arquitectura", "Willian & Molina"}
        };

        // Mostramos los datos de cada compañero
        for (int i = 0; i < compañeros.length; i++) {
            System.out.println("Nombre: " + compañeros[i][0]);
            System.out.println("Apellido: " + compañeros[i][1]);
            System.out.println("Carrera: " + compañeros[i][2]);
            System.out.println("Lugar de Trabajo: " + compañeros[i][3]);
            System.out.println("-------------------------------");
        }
    }
}
    
    

