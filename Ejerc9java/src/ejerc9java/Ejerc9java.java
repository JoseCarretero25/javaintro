/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc9java;

import ejerc9java.entidades.Matematica;
import ejerc9java.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc9java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio ls = new Servicio();
       Matematica a = ls.cargarNumeros();
       ls.retornarMayor(a);
       ls.calcularPotencia(a);
       ls.calcularRaiz(a);
    }
    
}
