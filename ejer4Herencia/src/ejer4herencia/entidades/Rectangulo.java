/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4herencia.entidades;

import ejer4herencia.interfases.calculosFormas;
import static ejer4herencia.interfases.calculosFormas.PI;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Rectangulo extends FormasGeometricas implements calculosFormas{
    protected double base;
    protected double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(double base, double altura, double area, double perimetro) {
        super(area, perimetro);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public void Area() {
        Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
        System.out.println("Cual es la base y altura del rectangulo?");
        this.base = leer.nextDouble();
        this.altura = leer.nextDouble();
        this.area = this.getBase() * this.getAltura();
        System.out.println("El area del rectangulo es de : " + this.getArea());
    }

    @Override
    public void Perimetro() {
        double suma = this.getBase() + this.getAltura();
        double perimetros = Math.pow(suma, 2);
        this.perimetro = perimetros;
        System.out.println("El perimetro del rectangulo es de : " + this.getPerimetro());
    }
    
    
}
