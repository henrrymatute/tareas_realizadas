/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SkyNet
 */
public class principal {
   

    public static void main(String[] args) {
        // Instanciar la clase Recursos
        Recursos recursos = new Recursos();

        // Llamar al primer método
        String mensaje = recursos.mensajeProgramacion();
        System.out.println(mensaje);

        // Llamar al segundo método con una edad de ejemplo
        int edad = 54;
        String resultadoEdad = recursos.verificarEdad(edad);
        System.out.println("Edad: " + edad + " - " + resultadoEdad);

        // Llamar al tercer método con dos números para multiplicar
        int num1 = 9;
        int num2 = 7;
        int resultadoMultiplicacion = recursos.multiplicar(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + resultadoMultiplicacion);

        // Llamar al cuarto método con un valor de X
        int x = 20;
        java.util.List<Integer> listaNumeros = recursos.generarLista(x);
        System.out.println("Lista de números del 1 al " + x + ": " + listaNumeros);
    }
}

    

