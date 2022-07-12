/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5.cuenta;

import Cuenta.bancaria;
import Cuenta.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc5Cuenta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio ();
        bancaria a = ls.crearCuenta();
        ls.ingresoSaldo(0);
        ls.retirnoSaldo(0);
        ls.retiroExtra(0);
        ls.consultaSaldo();
        ls.consultaDatos();
    }
    
}
