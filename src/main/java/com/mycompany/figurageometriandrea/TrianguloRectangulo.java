/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.figurageometriandrea;

/**
 *
 * @author DELL
 */
public class TrianguloRectangulo extends FiguraGeometriAndrea {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public double calcularHipotenusa() {
        return Math.sqrt(base * base + altura * altura);
    }

    public String tipoTriangulo() {
        double hipotenusa = calcularHipotenusa();
        if (base == altura && altura == hipotenusa) {
            return "Equilatero";
        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";
        }
    }
}
