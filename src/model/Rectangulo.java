package model;

/**
 * Esta clase define objetos de tipo Rectángulo con una base y una
 * altura como atributos.
 * 
 * @version 1.2/2023
 */
public class Rectangulo {
    private int base; // Atributo que define la base de un Rectángulo
    private int altura; // Atributo que define la altura de un Rectángulo

    /**
     * Constructor de la clase Rectángulo
     * 
     * @param base Parámetro que define la base de un Rectángulo
     * @param altura Parámetro que define la altura de un Rectángulo
     */
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un Rectángulo como la
     * multiplicación de la base por la altura
     * 
     * @return Área de un Rectángulo
     */
    public double calcularArea() {
        return base * altura;
    }

    /**
     * Método que calcula y devuelve el perímetro de un Rectángulo
     * como (2 + base) + (2 * altura)
     * 
     * @return Perímetro de un Rectángulo
     */
    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }
}
