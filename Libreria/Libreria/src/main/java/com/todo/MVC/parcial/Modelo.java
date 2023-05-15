/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.MVC.parcial;

import java.util.ArrayList;
import java.util.List;

 class Modelo {
    private final List<Libro> libros;

    
   public Modelo() {
        libros = new ArrayList<>();
        // Agregar libros de ejemplo al modelo
        libros.add(new Libro("Harry Potter y la Piedra Filosofal", "J.K. Rowling", true));
        libros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", true));
        libros.add(new Libro("El señor de los anillos", "J.R.R. Tolkien", true));
        libros.add(new Libro("1984", "George Orwell", true));
    }
    List<Libro> buscarLibrosPorTitulo(String titulo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void reservarLibro(Libro libro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}