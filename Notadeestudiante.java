/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notadeestudiante;

/**
 *
 * @author SkyNet
 */
public class Notadeestudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
System.out.println("======Alumnos Aprovados y Reprobados======");        
// Datos
        String[] estudiantes = {"Xiomara", "Juan Orlando"};
        int[] notas = {65, 89};

        //estudiantes y sus notas
        for (int i = 0; i < estudiantes.length; i++) {
            String nombre = estudiantes[i];
            int nota = notas[i];
            String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";

            // Imprimir los resultados
            System.out.println(nombre);
            System.out.println(nota);
            System.out.println(resultado);
            System.out.println();  // Línea en blanco para separar cada estudiante
        }
    }

    }
    

