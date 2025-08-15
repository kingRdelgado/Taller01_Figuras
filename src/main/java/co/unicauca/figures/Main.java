package co.unicauca.figures;

import co.unicauca.figures.domain.Circle;
import co.unicauca.figures.domain.Figure;
import co.unicauca.figures.domain.Square;
import co.unicauca.figures.domain.Triangle;
import java.util.ArrayList;
import java.util.List;

/**
 * Ejemplo de polimorfismo en figuras geométricas
 * Muestra el área y perímetro de diferentes figuras
 * con una salida más clara y ordenada.
 * 
 * @author Ricardo
 */
public class Main {

    public static void main(String[] args) {
        // Crear figuras
        Figure fig1 = new Circle(1);
        Figure fig2 = new Circle(2.3);

        Figure fig3 = new Square(2);
        Figure fig4 = new Square(6);

        Figure fig5 = new Triangle(3, 4, 5);
        Figure fig6 = new Triangle(1, 2, 3);

        // Lista polimórfica
        List<Figure> figures = new ArrayList<>();
        figures.add(fig1);
        figures.add(fig2);
        figures.add(fig3);
        figures.add(fig4);
        figures.add(fig5);
        figures.add(fig6);

        // Encabezado
        System.out.println("=======================================");
        System.out.println("     CÁLCULO DE ÁREAS Y PERÍMETROS     ");
        System.out.println("=======================================\n");

        // Recorremos la lista y mostramos resultados
        int count = 1;
        for (Figure fig : figures) {
            System.out.println("Figura #" + count + " → " + fig.getClass().getSimpleName());
            System.out.printf("   Área:      %.2f\n", fig.calculateArea());
            System.out.printf("   Perímetro: %.2f\n", fig.calculatePerimeter());
            System.out.println("---------------------------------------");
            count++;
        }

        // Pie
        System.out.println("\nFin del programa.");
    }
}


