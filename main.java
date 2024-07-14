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
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Agregamos algunos libros de prueba
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela", true));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949, "Distopía", true));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Novela", true));

        do {
            System.out.println("\nBiblioteca Virtual");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libros por título o autor");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Mostrar libros disponibles");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el año de publicación: ");
                    int anioPublicacion = scanner.nextInt();
                    scanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el género del libro: ");
                    String genero = scanner.nextLine();
                    System.out.print("¿Está disponible? (true/false): ");
                    boolean disponibilidad = scanner.nextBoolean();
                    biblioteca.agregarLibro(new Libro(titulo, autor, anioPublicacion, genero, disponibilidad));
                    break;
                case 2:
                    System.out.print("Ingrese el título o autor a buscar: ");
                    String criterio = scanner.nextLine();
                    System.out.println("Resultados de búsqueda:");
                    biblioteca.buscarLibros(criterio).forEach(System.out::println);
                    break;
                case 3:
                    System.out.print("Ingrese el título del libro a prestar: ");
                    titulo = scanner.nextLine();
                    if (biblioteca.prestarLibro(titulo)) {
                        System.out.println("Libro prestado exitosamente.");
                    } else {
                        System.out.println("No se pudo prestar el libro. Puede que no esté disponible o no exista.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el título del libro a devolver: ");
                    titulo = scanner.nextLine();
                    if (biblioteca.devolverLibro(titulo)) {
                        System.out.println("Libro devuelto exitosamente.");
                    } else {
                        System.out.println("No se pudo devolver el libro. Puede que ya esté disponible o no exista.");
                    }
                    break;
                case 5:
                    System.out.println("Libros disponibles:");
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}

