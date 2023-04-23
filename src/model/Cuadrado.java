package model;

/**
 * Esta clase define objetos de tipo Cuadrado con un lado como atributo.
 * 
 * @version 1.1/2023
 */
public class Cuadrado {
    private int lado; // Atributo que define el lado de un Cuadrado

    /**
     * Constructor de la clase Cuadrado
     * 
     * @param lado Parámetro que define la longitud de la base de un
     *             Cuadrado
     */
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    /**
     * Método que calcula y devuelve el área de un Cuadrado como el
     * lado elevado al Cuadrado
     * 
     * @return Área de un Cuadrado
     */
    public double calcularArea() {
        return lado * lado;
    }

    /**
     * Método que calcula y devuelve el perímetro de un Cuadrado como
     * cuatro veces su lado
     * 
     * @return Perímetro de un Cuadrado
     */
    public double calcularPerimetro() {
        return (4 * lado);
    }
}
