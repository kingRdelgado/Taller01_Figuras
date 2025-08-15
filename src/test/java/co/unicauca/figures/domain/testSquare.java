/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Square.
 * Evalúa el cálculo de perímetro y área en un cuadrado de lado 2.
 * 
 * @author Ricardo 
 */
public class testSquare {

    public testSquare() {
    }

    @Test
    public void testPerimetroCuadrado() {
        // Crear cuadrado con lado 2
        Square square = new Square(2);

        // Perímetro esperado (4 lados de longitud 2)
        double esperado = 2 * 4;

        // Perímetro calculado
        double obtenido = square.calculatePerimeter();

        // Compara valores con tolerancia de 0.01
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testAreaCuadrado() {
        // Crear cuadrado con lado 2
        Square square = new Square(2);

        // Área esperada (lado * lado)
        double esperado = 2 * 2;

        // Área calculada
        double obtenido = square.calculateArea();

        // Compara valores con tolerancia de 0.01
        assertEquals(esperado, obtenido, 0.01);
    }
}