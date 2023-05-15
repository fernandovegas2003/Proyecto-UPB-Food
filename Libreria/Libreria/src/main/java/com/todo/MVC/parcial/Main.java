/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.MVC.parcial;

/**
 *
 * @author 000501008
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);

        // Ejemplo de uso: buscar libros por título
        String tituloBusqueda = "Harry Potter";
        controlador.buscarLibroPorTitulo(tituloBusqueda);

        // Ejemplo de uso: reservar un libro
          List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(tituloBusqueda);
        if (!librosEncontrados.isEmpty()) {
            Libro libroReserva = librosEncontrados.get(0);
            controlador.reservarLibro(libroReserva);
        }
    }
}
