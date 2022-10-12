/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.servicio;

import ejextra2relaciones.entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioEspectador {
 private ArrayList <Espectador> publico;
  private Scanner leer;
  public ServicioEspectador() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.publico = new ArrayList() ;   
  }   
 public Espectador CrearEspectador() {
     char nombre = (char) (Math.random() * 26 + 'A');
     int edad = (int) (Math.random() * 100);
     int dinero = (int) (Math.random() * 1000);
     return new Espectador(nombre,edad,dinero);
 }
 public ArrayList <Espectador> AdherirEspectador(Espectador a) {
  publico.add(a);
  return publico;
 }
 public ArrayList <Espectador> Fabricadepublico() {
   ArrayList <Espectador> creado = new ArrayList();  
   int cantidadacrear = (int) (Math.random() * 48);
     for (int i = 0; i < cantidadacrear; i++) {
      Espectador crear = CrearEspectador();
      creado = AdherirEspectador(crear);      
     }
   return creado;
 }
 
 public void  Listapublico() {
     for (Espectador aux : publico) {
         System.out.println(aux.toString());
         
     }
     
 }
}
