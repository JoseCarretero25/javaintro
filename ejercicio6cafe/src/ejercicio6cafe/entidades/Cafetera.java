/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6cafe.entidades;

/**
 *
 * @author macbookair
 */
public class Cafetera {
    private double capacidadMaxima;
    private double capacidadActual;

    public Cafetera() {
        capacidadMaxima = 100;
        capacidadActual = 0;
    }

    public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = 100;
        this.capacidadActual = 0;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + '}';
    }
    
    
}
