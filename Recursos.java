/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SkyNet
 */
public class Recursos {
   

    // retorna un mensaje específico
    public String mensajeProgramacion() {
        return "Programación Orientada a Objetos 2024";
    }

    // verifica la mayoría de edad
    public String verificarEdad(int edad) {
        if (edad >= 21) {
            return "Mayor de edad";
        } else {
            return "Menor de edad";
        }
    }

    // realiza la multiplicación de dos números
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // genera una lista de números del 1 al X
    public java.util.List<Integer> generarLista(int x) {
        java.util.List<Integer> lista = new java.util.ArrayList<>();
        for (int i = 1; i <= x; i++) {
            lista.add(i);
        }
        return lista;
    }
}

    

