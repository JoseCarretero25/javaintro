/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrairon.servicio;

import extrairon.entidades.Escudo;
import extrairon.entidades.Objetos;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Servicio {
   
   ServicioObjetos M = new ServicioObjetos (); 
   Scanner leer = new Scanner (System.in).useDelimiter("\n");
  Escudo a = new Escudo();

public float EstadoBateria(){
    float caminar = 0;
    float correr =0;
    float propulsar = 0;
    float volar = 0;
    float disparar = 0;
    float escribir = 0;
    float bateria = a.getGenerador();
    boolean reparar = false;
    do {
    System.out.println("Ingrese una accion a realizar");
    String accion = leer.next();
    System.out.println("Por cuanto tiempo va a ejecutarla?");
    int tiempo = leer.nextInt();
    if (accion.equalsIgnoreCase("caminar")) {
        caminar = a.getGenerador() - 100 * tiempo;
        a.setGenerador(caminar); }
    if (accion.equalsIgnoreCase("correr")) {
        correr = a.getGenerador() - 200 * tiempo;
        a.setGenerador(correr); 
    }    
    if (accion.equalsIgnoreCase("propulsarse")){
     propulsar = a.getGenerador() - 30000 * tiempo;
     a.setGenerador(propulsar);
    } 
    if (accion.equalsIgnoreCase("volar")) {
      volar = a.getGenerador() - 300 - 100 * tiempo;
      a.setGenerador(volar); 
    }
    if (accion.equalsIgnoreCase("disparar")) {
       disparar = a.getGenerador() - 300 * tiempo;
       a.setGenerador(disparar);
    }
    if (accion.equalsIgnoreCase("escribir") || accion.equalsIgnoreCase("hablar")) { 
    escribir = a.getGenerador() - 50 * tiempo;
    a.setGenerador(escribir); 
    }
    MostrandoEstado(); 
    MostrarInfoReactor();
    ReparandoDanios();
      if (Sufriendodanios() == true && ReparandoDanios()  == false) {  
      System.out.println("El dispositivo esta daniado, no puede seguir operando");
       a.setBota1(false);
       a.setBota2(false);
       a.setGuante1(false);
       a.setGuante2(false);
       MostrandoEstado();
       if (RevisandoDispositivos() == false) {
           break;
       }
      }  
      
    }  while (a.getGenerador() >= 0); 
     return bateria;    
    } 
   
public void MostrarInfoReactor (){
    float joule = a.getGenerador() * 4186800 / 1000000;
    System.out.println("La bateria en Joule es de : " + joule);
    float caloria = a.getGenerador() * 238845896 / 1000000;
    System.out.println("La bateria en calorias es de : " + caloria);
}
public boolean Sufriendodanios(){
    double ruleta = (double) Math.random() * 100;
    boolean roto = false;
    if (ruleta <= 30) {
      roto = true;
      
    } 
    return roto;
}
public boolean ReparandoDanios() {
    double posibilidad = (double) Math.random() * 100;
    boolean reparar = false;
    if (posibilidad <= 40 && Sufriendodanios() == true) {
        reparar = true;
        System.out.println("El dispositivo se arreglo solo");
    }   
    return reparar;
      
   }
public boolean RevisandoDispositivos(){
    double azar = (double) Math.random() * 100;
    boolean zafo = false;
    do {
        System.out.println("El dispositivo intentara arreglarse");
     if ((a.isBota1() == false || a.isBota2() == false || a.isGuante1() == false || a.isGuante2() == false) && azar < 30)  {
       zafo = true;
       a.setBota1(true);
       a.setBota2(true);
       a.setGuante1(true);
       a.setGuante2(true);
         System.out.println("Se repararon los dispositivos"); break; 
     } else { 
         System.out.println("Los dispositivos se han destruido"); break;
     }
    } while (a.isBota1() != true && a.isGuante1() != true);
    return zafo;
}

 public void DestruyendoEnemigos (Objetos varios) {
     boolean hostil = varios.isHostil();
     float disparar = a.getGenerador();
     double distancia = varios.getDistancia();
     double resistencia = varios.getDistancia();
     double danio = 0;
     if (hostil == true && distancia <= 5000) {
     do {
     distancia = distancia + 500;
     danio = distancia - varios.getResistencia();
     varios.setResistencia(danio);
     } while (resistencia >= 0);
         System.out.println("El objeto se ha destruido");
 }
 
 }
 public void RadarVersion10 () {
    M.FabricadeObjetos(10);
    M.MostrarObjetos();
        
 } 
 
public Escudo MostrandoEstado(){
    System.out.println("Bota1 : " + a.isBota1());
    System.out.println("Bota2 : " + a.isBota2());
    System.out.println("Guante1 : " + a.isGuante1());
    System.out.println("Guante2 : " + a.isGuante2());
    System.out.println("Bateria : " + (a.getGenerador() * 100) / 1000000 + "%");
    return a;
} 

}
