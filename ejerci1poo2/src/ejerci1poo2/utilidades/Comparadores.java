/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci1poo2.utilidades;

import ejerci1poo2.entidades.Razas;
import java.util.Comparator;

/**
 *
 * @author macbookair
 */
public class Comparadores {
    public static Comparator<Razas> ordenarpornombredesc = new Comparator<Razas>() {
        @Override
        public int compare(Razas o1, Razas o2) {
           return o2.getRazar().compareTo(o1.getRazar());
        }
    };
}
