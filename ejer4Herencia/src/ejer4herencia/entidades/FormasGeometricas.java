/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4herencia.entidades;

import ejer4herencia.interfases.calculosFormas;

/**
 *
 * @author macbookair
 */
public class FormasGeometricas implements calculosFormas {
    protected double area;
    protected double perimetro;

    public FormasGeometricas() {
    }

    public FormasGeometricas(double area, double perimetro) {
        this.area = area;
        this.perimetro = perimetro;
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
        return "FormasGeometricas{" + "area=" + area + ", perimetro=" + perimetro + '}';
    }

    @Override
    public void Area() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
    
}
