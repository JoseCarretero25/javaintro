/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2herencia;

import ejer2herencia.entidades.Electrodomestico;
import ejer2herencia.entidades.Lavadora;
import ejer2herencia.enumeraciones.Televisor;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbookair
 */
public class Ejer2Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Electrodomestico> lista = new ArrayList();
        Electrodomestico lavadora = new Lavadora();
        lavadora = lavadora.crearElectrodomestico();
        lavadora.precioFinal();
        System.out.println(lavadora.toString());
        Electrodomestico lavadora2= new Lavadora();
        lavadora2 = lavadora2.crearElectrodomestico();
        lavadora2.precioFinal();
        System.out.println(lavadora2);
        Electrodomestico tele = new Televisor();
        tele = tele.crearElectrodomestico();
        tele.precioFinal();
        System.out.println(tele.toString());
        Electrodomestico tele2 = new Televisor();
        tele2 = tele2.crearElectrodomestico();
        tele2.precioFinal();
        System.out.println(tele2.toString());
        lista.add(lavadora);
        lista.add(lavadora2);
        lista.add(tele);
        lista.add(tele2);
        
        Iterator <Electrodomestico> it = lista.iterator();
        Integer suma = 0;
        while (it.hasNext()) {
            Electrodomestico ele = it.next();
            System.out.println("Los precios de los productos ingresados son  : " + ele.getPrecio());
            suma = suma + ele.getPrecio();
        }
        System.out.println("La suma de los precios es de : " + suma);
    
    }
    
}
