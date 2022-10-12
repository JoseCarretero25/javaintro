/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa;

import e1jpa.Servicio.ServicioAutor;
import e1jpa.Servicio.ServicioLibro;

/**
 *
 * @author macbookair
 */
public class E1JPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioAutor sa = new ServicioAutor();
        ServicioLibro sl = new ServicioLibro();
        sl.crearLibro();
    }
    
    
}
