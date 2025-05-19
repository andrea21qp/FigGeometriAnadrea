/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figurageometriandrea;

/**
 *
 * @author DELL
 */
public class FiguraGeometriAndrea {

    public static void main(String[] args) {
 Circulo c = new Circulo(10);
        Rectangulo r = new Rectangulo(8, 12);
        Cuadrado q = new Cuadrado(3);
        TrianguloRectangulo t = new TrianguloRectangulo(6, 8);

        System.out.println("\nCirculo:");
        System.out.println("Area: " + c.calcularArea());
        System.out.println("Perimetro: " + c.calcularPerimetro());

        System.out.println("\nRectangulo:");
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Area: " + q.calcularArea());
        System.out.println("Perimetro: " + q.calcularPerimetro());

        System.out.println("\nTriangulo Rectangulo:");
        System.out.println("Area: " + t.calcularArea());
        System.out.println("Perimetro: " + t.calcularPerimetro());
        System.out.println("Hipotenusa: " + t.calcularHipotenusa());
        System.out.println("Tipo: " + t.tipoTriangulo());
    }
}

    

