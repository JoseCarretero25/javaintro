/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4herencia.entidades;

import ejer4herencia.interfases.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Circulo extends FormasGeometricas implements calculosFormas {
    protected double radio;
    protected double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public Circulo(double radio, double diametro, double area, double perimetro) {
        super(area, perimetro);
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", diametro=" + diametro + '}';
    }

    @Override
    public void Area() {
    Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
        System.out.println("Cual es el radio del circulo?");
        this.radio = leer.nextDouble();
        this.area = PI * Math.pow(this.radio, 2);
        System.out.println("El area del circulo es de : " + this.getArea());
    }

    @Override
    public void Perimetro() {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Cual es el diametro del circulo?");
        this.diametro = leer.nextDouble();
        this.perimetro = PI * this.diametro;
        System.out.println("El perimetro del circulo es de : " + this.getPerimetro());
    }
    
    
}
