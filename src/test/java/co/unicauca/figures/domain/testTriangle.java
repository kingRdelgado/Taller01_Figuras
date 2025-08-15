/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package co.unicauca.figures.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Pruebas unitarias para la clase Triangle.
 * Evalúa el cálculo de perímetro y área en un triángulo 3-4-5.
 * 
 * @author Ricardo
 */
public class testTriangle {

    @Test
    public void testPerimetro() {
        // Triángulo con lados 3, 4 y 5
        Triangle triangle = new Triangle(3, 4, 5);

        // Perímetro esperado (suma de lados)
        double esperado = 3 + 4 + 5;

        // Perímetro calculado por el método
        double obtenido = triangle.calculatePerimeter();

        // Verifica que ambos valores sean casi iguales
        assertEquals(esperado, obtenido, 0.01);
    }

    @Test
    public void testArea() {
        // Triángulo con lados 3, 4 y 5
        Triangle triangle = new Triangle(3, 4, 5);

        // Semiperímetro
        double s = (3 + 4 + 5) / 2.0;

        // Área esperada usando la fórmula de Herón
        double esperado = Math.sqrt(s * (s - 3) * (s - 4) * (s - 5));

        // Área calculada por el método
        double obtenido = triangle.calculateArea();

        // Verifica que el área calculada sea correcta
        assertEquals(esperado, obtenido, 0.01);
    }
}