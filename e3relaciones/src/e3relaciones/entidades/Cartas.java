/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3relaciones.entidades;

import e3relaciones.enumeraciones.Palos;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Cartas {
    
    private int numero;
    private Palos palos;

    public Cartas() {
    }

    public Cartas(int numero, Palos palos) {
        this.numero = numero;
        this.palos = palos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palos getPalos() {
        return palos;
    }

    public void setPalos(Palos palos) {
        this.palos = palos;
    }

    @Override
    public String toString() {
        return "Cartas{" + "numero=" + numero + ", palos=" + palos + '}';
    }
    


    
   
    

   
    
}

    