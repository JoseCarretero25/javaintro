/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci1poo2.Servicio;

import ejerci1poo2.entidades.Razas;
import ejerci1poo2.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author macbookair
 */
public class Servicio {
    private ArrayList <Razas> razas; 
   private Scanner leer;
   

  public Servicio() {
     this.leer  = new Scanner (System.in).useDelimiter("\n");
     this.razas = new ArrayList() ;
        
    }
 
public void Iterador () {
  Iterator <Razas> it = razas.iterator(); 
  int tamanio = razas.size();
  System.out.println("Ingrese una raza a eliminar");
  String eliminar = leer.next();
  
  while(it.hasNext()) {
  Razas m = it.next();
  if (m.getRazar().equalsIgnoreCase(eliminar)) {
      it.remove();
      
  } 
       

} if (tamanio == razas.size()) {
    System.out.println("La raza ingresada no esta en la lista");
} Collections.sort(razas, Comparadores.ordenarpornombredesc);
  MostrarRaza();
} 

   public Razas CrearRazas () {
       System.out.println("Ingrese una raza");
       String raza= leer.next();
       return new Razas(raza);
   } 
   public void AdherirRaza (Razas a) {
       razas.add(a);
   }
   public void MostrarRaza () {
      for (Razas aux : razas) {
           System.out.println(aux.toString());
       } System.out.println("cantidad" + razas.size());
   }
   public void FabricaRazas (int cantidad) {
       for (int i = 0; i < cantidad; i++) {
       Razas RazasCreada = CrearRazas();
       AdherirRaza (RazasCreada);
       System.out.println("Desea salir?");
       String consulta = leer.next();
       if (consulta.equalsIgnoreCase("si")) {
            break;
       }
   } 
   }
   
 
}
