package model;

/**
 * Esta clase define objetos de tipo Triángulo Rectángulo con una
 * base y una altura como atributos.
 * 
 * @version 1.3/2023
 */
public class TrianguloRectangulo {
    private int base; // Atributo que define la base de un Triángulo Rectángulo
    private int altura; // Atributo que define la altura de un Triángulo Rectángulo

    /**
     * Constructor de la clase TriánguloRectángulo
     * 
     * @param base Parámetro que define la base de un Triángulo
     *             Rectángulo
     * @param altura Parámetro que define la altura de un Triángulo
     *               Rectángulo
     */
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Método que calcula y devuelve el área de un Triángulo Rectángulo
     * como la base multiplicada por la altura sobre 2
     * 
     * @return Área de un Triángulo Rectángulo
     */
    public double calcularArea() {
        return (base * altura / 2);
    }

    /**
     * Método que calcula y devuelve el perímetro de un Triángulo
     * Rectángulo como la suma de la base, altura y la hipotenusa
     * 
     * @return Perímetro de un Triángulo Rectángulo
     */
    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa()); /**Invoca al método calcular hipotenusa */
    }

    /**
     * Método que calcula y devuelve la hipotenusa de un Triángulo
     * Rectángulo utilizando el teorema de Pitágoras
     * @return Hipotenusa de un Triángulo Rectángulo
     */
    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

/**
 * Método que determina si un triángulo es:
 * - Equilatero: si sus tres lados son iguales
 * - Escaleno: si sus tres lados son todos diferentes
 * - Isósceles: si dos de sus lados son iguales y el otro es diferente de los demás
 */
    public void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
            System.out.println("Es un triángulo equilátero"); /* Todos sus lados sin iguales */
        } else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
            System.out.println("Es un triángulo escaleno"); /* Todos sus lados son diferentes */
        } else{
            System.out.println("Es un triángulo isósceles"); /* De otra manera, es isósceles */
        }
    }
}
