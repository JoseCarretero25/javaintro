/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3relaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Mazo {
private ArrayList <Cartas> cartas;

    public Mazo() {
    }

    public Mazo(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Cartas> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Cartas> cartas) {
        this.cartas = cartas;
    }

    @Override
    public String toString() {
        return "Mazo{" + "cartas=" + cartas + '}';
    }

}
