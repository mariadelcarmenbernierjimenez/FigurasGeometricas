package app;

import model.Circulo;
import model.Cuadrado;
import model.Rectangulo;
import model.TrianguloRectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Círculo
        Circulo objCirculo = new Circulo(2);
        System.out.println("El área del Circulo es: " + objCirculo.calcularArea());
        System.out.println("El perimetro del circulo es: " + objCirculo.calcularPerimetro());
        System.out.println("");

        // Cuadrado
        Cuadrado objCuadrado = new Cuadrado(8);
        System.out.println("El área del Cuadrado es: " + objCuadrado.calcularArea());
        System.out.println("El perímetro del Cuadrado es: " + objCuadrado.calcularPerimetro());
        System.out.println("");

        // Rectángulo
        Rectangulo objRectangulo = new Rectangulo(6, 4);
        System.out.println("El área del Rectángulo es: " + objRectangulo.calcularArea());
        System.out.println("El perímetro del Rectángulo es: " + objRectangulo.calcularPerimetro());
        System.out.println("");

        // Triángulo Rectángulo
        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(5, 9);
        System.out.println("El área del Triángulo Rectángulo es: " + objTrianguloRectangulo.calcularArea());
        System.out.println("El perímetro del Triángulo Rectángulo es: " + objTrianguloRectangulo.calcularPerimetro());
        objTrianguloRectangulo.determinarTipoTriangulo();
    }
}
