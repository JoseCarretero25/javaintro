/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones;

/**
 *
 * @author macbookair
 */
public class Pruebaexcepcion extends Exception {

    /**
     * Creates a new instance of <code>Pruebaexcepcion</code> without detail
     * message.
     */
    public Pruebaexcepcion() {
    }

    /**
     * Constructs an instance of <code>Pruebaexcepcion</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public Pruebaexcepcion(String msg) {
        super(msg);
    }
}
