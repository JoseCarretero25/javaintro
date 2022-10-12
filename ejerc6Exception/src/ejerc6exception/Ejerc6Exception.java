/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6exception;

import java.io.IOException;

/**
 *
 * @author macbookair
 */
public class Ejerc6Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {    
    servicio ser = new servicio();
        System.out.println(ser.metodo());

} catch (Exception e) {
        System.err.println("Excepcion del metodo()");
        e.printStackTrace();
}
}
}
    
