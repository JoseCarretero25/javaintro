/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import ejercicio3.entidades.numerosentidades;
import ejercicio3.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        numerosentidades a = ls.ingresenumeros1();
        numerosentidades b = ls.ingresenumeros2();
        System.out.println("Los numeros ingresados son : " + (int) a.getNumero1() + " y " + (int) b.getNumero2());
        ls.Suma();
        ls.Resta();
        ls.Multiplicacion();
        ls.Division();
        
    }
    
}
