/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia;

import ejerc3extraherencia.entidades.Alojamientos;
import ejerc3extraherencia.entidades.Camping;
import ejerc3extraherencia.entidades.ExtraHotel;
import ejerc3extraherencia.entidades.Hotel;
import ejerc3extraherencia.entidades.Hotel4E;
import ejerc3extraherencia.entidades.Hotel5E;
import ejerc3extraherencia.entidades.Residencias;
import ejerc3extraherencia.enumeraciones.Gimnasio;
import ejerc3extraherencia.utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macbookair
 */
public class Ejerc3extraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <String> alojamientos = new ArrayList();
        ArrayList <Hotel> hoteles = new ArrayList();
      Hotel hotel1 = new Hotel(200, 2, 2, 0, "Los Patos", "San Martin 12", "San Rafael", "Jose Perez");
      hotel1.setPrecioHabitacion(hotel1.precioalojamiento());
      alojamientos.add(hotel1.toString());
      hoteles.add(hotel1);
      Hotel hotel4E1 = new Hotel4E(Gimnasio.A, "PIZZAS",10000, 300, 4,5, 0,"Junin","Alberdi 123", "San Rafael","Roberto Iglesias");
      hotel4E1.setPrecioHabitacion(hotel4E1.precioalojamiento());
      alojamientos.add(hotel4E1.toString());
      hoteles.add(hotel4E1);
      Hotel hotel4E2 = new Hotel4E(Gimnasio.B, "MILAS",1, 500, 4,10, 0,"Del Plata","Belgrano 123", "San Rafael","Juan Iglesias");
      hotel4E2.setPrecioHabitacion(hotel4E2.precioalojamiento());
      alojamientos.add(hotel4E2.toString());
      hoteles.add(hotel4E2);
      Hotel hotel5E1 = new Hotel5E(2, 10,100, Gimnasio.A,"Lomos",500,200,4,20, 0,"Tower","Yrigoyen 1200","San Rafael","Luis Miguel");
      hotel5E1.setPrecioHabitacion(hotel5E1.precioalojamiento());
      alojamientos.add(hotel5E1.toString());
      hoteles.add(hotel5E1);
      ExtraHotel camping1 = new Camping(100,2, true, true, 0,"Club de Campo","Ruta 143","San Rafael","Oscar Wilde");
      alojamientos.add(camping1.toString());
      ExtraHotel residencia1 = new Residencias(10, true, true, true, 0,"Familia Lopez","Los Sauces 20","San Rafael", "Pepe Cibrian");
      alojamientos.add(residencia1.toString());
      System.out.println(alojamientos);
      Collections.sort(hoteles, Comparador.ordenarasc);
      System.out.println(hoteles);
    
    }
    
}
