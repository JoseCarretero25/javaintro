/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci10java;

import ejerci10java.entidades.Arreglos;
import ejerci10java.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerci10java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        Arreglos A = new Arreglos();
        ls.llenarVector(A);
        ls.OrdenarVactorA(A);
        ls.llenadoVectorB(A);
    }
    
}
