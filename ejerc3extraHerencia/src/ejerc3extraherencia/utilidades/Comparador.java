/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia.utilidades;

import ejerc3extraherencia.entidades.Hotel;
import java.util.Comparator;

/**
 *
 * @author macbookair
 */
public class Comparador {
    public static Comparator <Hotel> ordenarasc = new Comparator <Hotel>() {
        @Override
        public int compare(Hotel o1, Hotel o2) {
           return o2.getPrecioHabitacion().compareTo(o1.getPrecioHabitacion());
        }
        
    } ;
      
    
}
