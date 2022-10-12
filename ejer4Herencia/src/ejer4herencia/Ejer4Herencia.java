/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4herencia;

import ejer4herencia.entidades.Circulo;
import ejer4herencia.entidades.FormasGeometricas;
import ejer4herencia.entidades.Rectangulo;

/**
 *
 * @author macbookair
 */
public class Ejer4Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormasGeometricas circulo1 = new Circulo();
        circulo1.Area();
        circulo1.Perimetro();
        FormasGeometricas rectangulo1 = new Rectangulo();
        rectangulo1.Area();
        rectangulo1.Perimetro();
        
    }
    
}
