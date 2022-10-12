/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1relaciones.servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import video1relaciones.entidades.Mascotas;
import video1relaciones.enumeraciones.raza;
import static video1relaciones.enumeraciones.raza.CANICHE;
import video1relaciones.enumeraciones.sexoaminal;

/**
 *
 * @author macbookair
 */
public class ServicioMascotas {
  private ArrayList <Mascotas> mascotas; 
   private Scanner leer;
   public ServicioMascotas() {
     this.leer  = new Scanner (System.in).useDelimiter("\n");
     this.mascotas = new ArrayList(); 
    }
           
  public Mascotas crearM () {
      Mascotas m = new Mascotas();
      System.out.println("Ingrese el nombre de la mascota");
      String nombre = leer.next();
      m.setNombre(nombre);
      System.out.println("Ingrese la edad");
      int edad = leer.nextInt();
      m.setEdad(edad);
     return m;
  }
  public void AdherirMascotas(Mascotas a) {
      mascotas.add(a);
      
  }
  public void MostrarMascota () {
      for (Mascotas lista : mascotas) {
          System.out.println(lista.toString());   
      }
  }
  public void FabricadeMascotas(int cantidad) {
      for (int i = 0; i < cantidad; i++) {
          Mascotas mascotacreada = crearM();
          AdherirMascotas(mascotacreada);
          System.out.println("Desea agregar otra mascota?");
       String consulta = leer.next();
       if (consulta.equalsIgnoreCase("no")) {
            break;
      } System.out.println(mascotacreada);
      } 
  }
 public Mascotas MascotaFavorita(){
 Iterator <Mascotas> it = mascotas.iterator();
 System.out.println("Ingrese el nombre de su mascota favorita");
 String favorita = leer.next();
 while(it.hasNext()) {
 Mascotas x = it.next();
  if (x.getNombre().equalsIgnoreCase(favorita)) {
      System.out.println(mascotas);
  }
 } return new Mascotas();
  }
  
}
