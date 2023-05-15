/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.MVC.parcial;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class ModeloTest {
    private Modelo modelo;

    @Before
    public void setUp() {
        modelo = new Modelo();
    }

    @Test
    public void buscarLibrosPorTitulo_DebeEncontrarLibrosCorrectos() {
        // Arrange
        String tituloBusqueda = "Harry Potter";

        // Act
        List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(tituloBusqueda);

        // Assert
        Assert.assertEquals(1, librosEncontrados.size());
        Assert.assertEquals("Harry Potter y la Piedra Filosofal", librosEncontrados.get(0).getTitulo());
    }

    @Test
    public void buscarLibrosPorTitulo_DebeRetornarListaVaciaSiNoEncuentraLibros() {
        // Arrange
        String tituloBusqueda = "Narnia";

        // Act
        List<Libro> librosEncontrados = modelo.buscarLibrosPorTitulo(tituloBusqueda);

        // Assert
        Assert.assertTrue(librosEncontrados.isEmpty());
    }

    @Test
    public void reservarLibro_DebeCambiarEstadoDeDisponibleAFalse() {
        // Arrange
        Libro libro = new Libro("El señor de los anillos", "J.R.R. Tolkien", true);

        // Act
        modelo.reservarLibro(libro);

        // Assert
        Assert.assertFalse(libro.isDisponible());
    }
}
