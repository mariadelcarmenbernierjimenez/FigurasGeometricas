package model; // paquete model

/**
 *  Esta clase define objetos de tipo Circulo con su radio como atributo.
 * 
 *  @version 1.0/2023
 *  Define un atributo llamado radio de tipo entero
 *  variable global en la clase...
 */
public class Circulo {
    private int radio;

    /**
     * Constructor de la clase Circulo
     * @param radio Párametro que define el radio de un Círculo
     */
    public Circulo(int radio) {
        this.radio = radio;
    }

    /**
     * Constructor de la clase Circulo sin parámetro o esta vacío
     */
    public Circulo() {

    }

    /**
     * Método que calcula y devuelve el área de un Círculo como pi multiplicado por
     * el radio al cuadrado
     * @return Área de un círculo
     */
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Método que calcula y devuelve el perímetro de un Círculo como la
     * multiplicación de 2 por pi por el radio
     * @return Perímetro de un círculo
     */
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
