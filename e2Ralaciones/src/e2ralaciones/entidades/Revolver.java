/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.entidades;

/**
 *
 * @author macbookair
 */
public class Revolver {
private double posicionactual;
private double posicionagua;

    public Revolver() {
    }

    public Revolver(double posicionactual, double posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public double getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(double posicionactual) {
        this.posicionactual = posicionactual;
    }

    public double getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(double posicionagua) {
        this.posicionagua = posicionagua;
    }


    @Override
    public String toString() {
        return "Revolver{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }

}