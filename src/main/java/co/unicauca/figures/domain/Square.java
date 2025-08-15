/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 * Representa un cuadrado definido por la longitud de su lado.
 * Implementa la interfaz Figure para calcular su perímetro y área.
 * 
 * Caso de uso: permite crear un cuadrado y obtener sus medidas geométricas.
 * 
 * @author Ricardo 
 */
public class Square implements Figure {

    // Longitud de un lado del cuadrado
    private double lado;

    /**
     * Constructor que inicializa el lado del cuadrado.
     * @param lado longitud de un lado
     */
    public Square(double lado) {
        this.lado = lado;
    }

    // Métodos getter y setter
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * Calcula el perímetro del cuadrado.
     * Fórmula: 4 * lado.
     * @return perímetro del cuadrado
     */
    @Override
    public double calculatePerimeter() {
        return 4 * lado;
    }

    /**
     * Calcula el área del cuadrado.
     * Fórmula: lado².
     * @return área del cuadrado
     */
    @Override
    public double calculateArea() {
        return lado * lado;
    }
}
