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
public class Controlador {

    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    Controlador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void buscarLibroPorTitulo(String titulo) {
        List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(titulo);
        vista.mostrarLibros(librosEncontrados);
    }

    public void reservarLibro(Libro libro) {
        modelo.reservarLibro(libro);
    }

    //

    Object getLibreria() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
