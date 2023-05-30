/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej1;

import java.util.Scanner;

/**
 *
 * @author Claudia
 */
class Libro {
       // Atributos de la clase Libro
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructor vacío
    public Libro() {}

    // Constructor con todos los atributos
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para cargar un libro pidiendo los datos al usuario
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de ISBN: ");
        this.isbn = scanner.nextLine();

        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();

        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }

    // Método para mostrar información del libro
    public void mostrarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
}
    }
