/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SkyNet
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorEmpleados gestor = new GestorEmpleados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = scanner.nextInt();
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = scanner.nextDouble();

                    Empleado empleado = new Empleado(nombre, edad, salario);
                    gestor.agregarEmpleado(empleado);
                    break;

                case 2:
                    gestor.mostrarEmpleados();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción invalida.");
            }
        }
    }
}

