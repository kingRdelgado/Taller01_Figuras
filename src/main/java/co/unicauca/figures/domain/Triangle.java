/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.unicauca.figures.domain;

/**
 * Representa un triángulo definido por tres lados.
 * Implementa la interfaz Figure para calcular su perímetro y área.
 * 
 * Caso de uso: permite instanciar un triángulo y obtener
 * sus propiedades geométricas.
 * 
 * @author Ricardo
 */
public class Triangle implements Figure {

    // Longitudes de los lados del triángulo
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * Constructor que inicializa los lados del triángulo.
     * @param lado1 longitud del primer lado
     * @param lado2 longitud del segundo lado
     * @param lado3 longitud del tercer lado
     */
    public Triangle(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Métodos getter y setter
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    /**
     * Calcula el perímetro del triángulo.
     * Fórmula: suma de los tres lados.
     * @return perímetro del triángulo
     */
    @Override
    public double calculatePerimeter() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Calcula el área del triángulo usando la fórmula de Herón.
     * Fórmula: √[s(s - a)(s - b)(s - c)]
     * donde s es el semiperímetro = (a + b + c) / 2.
     * @return área del triángulo
     */
    @Override
    public double calculateArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}