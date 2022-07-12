package armaduraironman.servicio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import armaduraironman.entidades.Objetos;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author macbookair
 */
public class ServicioO {
private TreeSet <Objetos> objetos;
private Scanner leer;
public ServicioO() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.objetos = new TreeSet();   
  }
    public Objetos crearObjetos (){
    String nombre = "robot";
    double resistencia = 100;
    boolean hostil = true;
    double distancia = (double) Math.random() * 100;
      return new Objetos (nombre, resistencia, hostil, distancia);  
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
    

