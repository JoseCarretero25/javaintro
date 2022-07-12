/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrairon.servicio;

import extrairon.entidades.Objetos;
import java.util.Scanner;
import extrairon.servicio.Servicio;
import java.util.ArrayList;
import java.util.TreeSet;
/**
 *
 * @author macbookair
 */
public class ServicioObjetos {
   
    
private ArrayList <Objetos> objetos;
private Scanner leer;
public ServicioObjetos() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.objetos = new ArrayList(); 
}
   public Objetos crearObjetos(){
    System.out.println("Escriba un nombre para el objeto");   
    String nombre = leer.next();
    double resistencia = 100;
    double distancia = (double) Math.random() * 10000;
    double azar = (double) Math.random() * 100;
    boolean hostil = false;
    if (azar >= 50) {
     hostil = true;   
    } 
    return new Objetos(nombre, resistencia, distancia , hostil);
    }
   
    public void AdherirObjetos (Objetos a) {
  objetos.add(a);
}
 public void MostrarObjetos() {
     for (Objetos mostrar : objetos) {
         System.out.println(mostrar.toString());
     }
 }
 public void FabricadeObjetos(int cantidad) {
     for (int i = 0; i < cantidad; i++) {
     Objetos objetocreado = crearObjetos();
     AdherirObjetos(objetocreado);
     System.out.println("Desea agregar otro objeto?");
     String consulta = leer.next();
     if (consulta.equalsIgnoreCase("no")) {
            break;
      }
 }
 }
    
    
    
    }

   
