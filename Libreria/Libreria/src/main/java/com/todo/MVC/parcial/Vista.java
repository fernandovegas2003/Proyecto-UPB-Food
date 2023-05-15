/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.MVC.parcial;

import java.util.List;

/**
 *
 * @author 000501008
 */
public class Vista {

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

