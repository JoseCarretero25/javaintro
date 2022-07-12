/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4poo2;

import ejerc4poo2.Servicio.Servicio;
import ejerc4poo2.utilidades.Comparadores;
import java.util.Collections;

/**
 *
 * @author macbookair
 */
public class Ejerc4poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Servicio ls = new Servicio();
   ls.FabricadePeliculas(100);
   ls.MostrarPeliculas();
   ls.Iterator1();
   ls.OrdenarporTitulo();
   ls.MostrarPeliculas();
   ls.OrdenarporDuracion();
   ls.MostrarPeliculas();
    }
    
}
