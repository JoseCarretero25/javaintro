/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas.Servicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import mascotas.entidades.Mascotas;

/**
 *
 * @author macbookair
 */
public class Servicio {
   private ArrayList <Mascotas> mascotas1; 
   private Scanner leer;
   public Servicio() {
     this.leer  = new Scanner (System.in).useDelimiter("\n");
     this.mascotas1 = new ArrayList() ;
        
    }
  
   public Mascotas crearMascotas() {
       System.out.println("Ingrese el nombre");
       String nombre = leer.next();
       System.out.println("Ingrese apodo");
       String apodo = leer.next();
       System.out.println("Ingrese tipo");
       String tipo = leer.next();
       
       return new Mascotas (nombre,apodo,tipo);
   }
   public void aniadirMascotas(Mascotas a) {
       mascotas1.add(a);
   }
   
   public void MostrarMascotas () {
       for (Mascotas aux : mascotas1) {
           System.out.println(aux.toString());
       } System.out.println("cantidad" + mascotas1.size());
   }
   public void FabricadeChiquitos( int cantidad) {
       for (int i = 0; i < cantidad; i++) {
            mascotas1.add(new Mascotas ("fernando", "chiquito" , "biegle")) ;
           
       }
   }
   public void FabricadeMascotas ( int cantidad) {
       for (int i = 0; i < cantidad; i++) {
         Mascotas mascotaCreada = crearMascotas();
         aniadirMascotas (mascotaCreada);
         System.out.println(mascotaCreada.toString());
       }
   }
   public void actualizarMascota(int index) {
     Mascotas m = mascotas1.get(index);
     m.setNombre("roberto");
   }
   public void actualizarMascotas2 (int index) {
       Mascotas m = crearMascotas();
       mascotas1.set(index, m);
   }
   public void EliminarMascota (int index) {
       mascotas1.remove(index);
   }
   public void EliminarporNombre (String nombre) {
     for (int i = 0; i < mascotas1.size() ; i++) {
         Mascotas m = mascotas1.get(i);
         if (m.getNombre().equals(nombre)) {
             mascotas1.remove(i);
         }
         
     }
 }  
   public void ActualizarMascota(String nombreViejo, String nombreNuevo) {
       for (int i = 0; i < mascotas1.size(); i++) {
           Mascotas m = mascotas1.get(i);
           if (m.getNombre().equalsIgnoreCase(nombreViejo)) {
               m.setNombre(nombreNuevo);
           }
           
       }
   }
}
