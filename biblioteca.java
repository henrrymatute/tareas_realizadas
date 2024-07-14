/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SkyNet
 */
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para buscar libros por título o autor
    public List<Libro> buscarLibros(String criterio) {
        return libros.stream()
                .filter(libro -> libro.getTitulo().equalsIgnoreCase(criterio) || libro.getAutor().equalsIgnoreCase(criterio))
                .collect(Collectors.toList());
    }

    // Método para prestar un libro
    public boolean prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && libro.isDisponibilidad()) {
                libro.setDisponibilidad(false);
                return true;
            }
        }
        return false;
    }

    // Método para devolver un libro
    public boolean devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo) && !libro.isDisponibilidad()) {
                libro.setDisponibilidad(true);
                return true;
            }
        }
        return false;
    }

    // Método para mostrar información detallada de los libros disponibles
    public void mostrarLibrosDisponibles() {
        libros.stream()
                .filter(Libro::isDisponibilidad)
                .forEach(System.out::println);
    }
}
