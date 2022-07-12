/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6cafe;

import ejercicio6cafe.entidades.Cafetera;
import ejercicio6cafe.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejercicio6cafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        Cafetera a = ls.llenarCafetera(0);
        ls.servirTaza();
        ls.vaciarCafetera(0);
        ls.agregarCafe(0);
    }
    
}
