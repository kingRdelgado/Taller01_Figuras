package co.unicauca.figures.domain;

/**
 *
 * @author Ricardo 
 */
public class Circle implements Figure{
    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calculatePerimeter() {
        return Math.PI*radio*2; 
    }

    @Override
    public double calculateArea() {
        return Math.PI*radio*radio;
    }
    
            
}
