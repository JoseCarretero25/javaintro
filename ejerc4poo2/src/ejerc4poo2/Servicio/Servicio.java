/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4poo2.Servicio;

import ejerc4poo2.entidades.Peliculas;
import ejerc4poo2.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
 private ArrayList <Peliculas> peliculas;
  private Scanner leer;
  public Servicio() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.peliculas = new ArrayList() ;   
  }
  public Peliculas CrearPeliculas () {
      System.out.println("Ingrese el Titulo de la Peliculas");
      String titulo = leer.next();
      System.out.println("Ingrese el Director");
      String director = leer.next();
      System.out.println("Ingrese la duracion en minutos");
      Integer duracion = leer.nextInt();
      return new Peliculas (titulo,director,duracion);
  }
  public void AdherirPeliculas (Peliculas a) {
      peliculas.add(a);
  }
  public void MostrarPeliculas () {
      for (Peliculas mostrar : peliculas) {
          System.out.println(mostrar.toString());
      }
  }
  public void FabricadePeliculas (int cantidad) {
      for (int i = 0; i < cantidad; i++) {
      Peliculas pelicreada = CrearPeliculas();
      AdherirPeliculas (pelicreada);
      System.out.println("Desea agregar otra pelicula?");
      String consulta = leer.next();
       if (consulta.equalsIgnoreCase("no")) {
            break;
      }
      }
      
  }
  public void Iterator1 () {
    Iterator <Peliculas> it = peliculas.iterator();
    while(it.hasNext()) {
    Peliculas x = it.next();
        if (x.getDuracion() > 60) {    
       System.out.println("Las peliculas que duran mas de 60 minutos son : " + " " + x.getTitulo());
      }
  }

}
 public void OrdenarporTitulo () {
  Collections.sort(peliculas, Comparadores.ordenarpornombredesc);   
}
 public void OrdenarporDuracion () {
  Collections.sort(peliculas, Comparadores.ordenarporduracion);   
}
}