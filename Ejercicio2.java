/* Desarrollar un programa que permita almacenar múltiples elementos de la clase Libro (Id, Título, Edición,
Autor) en un LinkedHashSet. */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

class Libro {
    private int id;
    private String titulo;
    private String edicion;
    private String autor;

    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Título: " + titulo + ", Edición: " + edicion + ", Autor: " + autor;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro otro = (Libro) obj;
        return this.id == otro.id;
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Libro> libros = new LinkedHashSet<>();
        String opcion;

        do {
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine(); // Limpiar buffer
            System.out.print("Título: ");
            String titulo = sc.nextLine();
            System.out.print("Edición: ");
            String edicion = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();

            libros.add(new Libro(id, titulo, edicion, autor));

            System.out.print("¿Desea ingresar otro libro? (s/n): ");
            opcion = sc.nextLine();
        } while (opcion.equalsIgnoreCase("s"));

        System.out.println("\nLibros ingresados:");
        for (Libro l : libros) {
            System.out.println(l);
        }
    }
}
