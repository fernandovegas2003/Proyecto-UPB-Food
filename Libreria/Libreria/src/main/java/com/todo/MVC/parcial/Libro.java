/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.MVC.parcial;

// Modelo

import java.util.List;
import java.util.ArrayList;
import java.util.List;

// Modelo
class Libro {
    
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(String titulo, String autor, boolean par) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

// Controlador
class Controlador {
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void buscarLibroPorTitulo(String titulo) {
        List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(titulo);
        vista.mostrarLibros(librosEncontrados);
    }

    public void reservarLibro(Libro libro) {
        modelo.reservarLibro(libro);
    }

    // Otros métodos para las demás funcionalidades
}

// Vista
class Vista {
    public void mostrarLibros(List<Libro> libros) {
        if (libros.isEmpty()) {
            System.out.println("No se encontraron libros.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro.getTitulo() + " - " + libro.getAutor());
            }
        }
    }
}

// Modelo
class Modelo {
    private List<Libro> libros;

    
    public Modelo() {
        libros = new ArrayList<>();
        // Agregar libros de ejemplo al modelo
        libros.add(new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", true));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", true));
        libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", true));
        libros.add(new Libro("1984", "George Orwell", true));
    }

    
    public List<Libro> buscarLibrosPorTitulo(String titulo) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }

    public void reservarLibro(Libro libro) {
        libro.setDisponible(false);
        System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido reservado.");
    }
    
}
