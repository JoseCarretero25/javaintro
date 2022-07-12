/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5poo2.servicio;

import ejerc5poo2.entidades.Paises;
import java.util.ArrayList;
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
private TreeSet <Paises> pais;
private Scanner leer;
public Servicio() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.pais = new TreeSet();   
  }
public Paises CrearPais () {
    System.out.println("Ingrese el Pais a crear");
    String pais = leer.next();
    return new Paises (pais);
}
public void AdherirPais (Paises a) {
  pais.add(a);
}
 public void MostrarPaises() {
     for (Paises mostrar : pais) {
         System.out.println(mostrar.toString());
     }
 }
 public void FabricadePaises(int cantidad) {
     for (int i = 0; i < cantidad; i++) {
         
     
     Paises paiscreado = CrearPais();
     AdherirPais(paiscreado);
     System.out.println("Desea agregar otro pais?");
     String consulta = leer.next();
     if (consulta.equalsIgnoreCase("no")) {
            break;
      }
 }
 }
 public void Iterator() {
 Iterator <Paises> it = pais.iterator(); 
  System.out.println("Ingrese un pais a eliminar");
  String eliminar = leer.next();
  while(it.hasNext()) {
  Paises recorrer = it.next();
  if (recorrer.getPais().equalsIgnoreCase(eliminar)) {
      it.remove();
  } 
}
 }
}
