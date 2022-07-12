/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4poo2.utilidades;

import ejerc4poo2.entidades.Peliculas;
import java.util.Comparator;

/**
 *
 * @author macbookair
 */
public class Comparadores {
public static Comparator<Peliculas> ordenarpornombredesc = new Comparator<Peliculas>() {
    @Override
    public int compare(Peliculas o1, Peliculas o2) {
      return o2.getTitulo().compareTo(o1.getTitulo());  
    }
};
 public static Comparator<Peliculas> ordenarporduracion = new Comparator<Peliculas>() {
    @Override
    public int compare(Peliculas o1, Peliculas o2) {
     return o2.getDuracion().compareTo(o1.getDuracion());
    }
};
}
