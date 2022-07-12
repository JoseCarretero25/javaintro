/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduraironman.servicio;
import armaduraironman.entidades.Armadura;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
  Scanner leer = new Scanner (System.in).useDelimiter("\n");
  Armadura a = new Armadura();
  ServicioO b = new ServicioO();
public Armadura MostrandoEstado(){
    System.out.println("Bota1 : " + a.isBota1());
    System.out.println("Bota2 : " + a.isBota2());
    System.out.println("Guante1 : " + a.isGuante1());
    System.out.println("Guante2 : " + a.isGuante2());  
    return a;
}
public float EstadoBateria(){
    float caminar = 0;
    float correr =0;
    float propulsar = 0;
    float volar = 0;
    float disparar = 0;
    float escribir = 0;
    float bateria = 0;
    do {
    bateria = a.getGenerador();    
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
     propulsar = a.getGenerador() - 300 * tiempo;
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
    } EstadoBateria();
    } while (bateria >= 0);
     return bateria;    
    }
     public void Mostrarradar() {
      b.FabricadeObjetos(10);
      b.MostrarObjetos();
  }  
}


