/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3relaciones.servicio;

import e3relaciones.entidades.Cartas;
import e3relaciones.entidades.Mazo;
import e3relaciones.enumeraciones.Palos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioCartas {

private ArrayList <Cartas> suma;
private Scanner leer;
public ServicioCartas() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
this.suma = new ArrayList();
 }
Cartas baraja = new Cartas();



public void MostrarMazo(){
    for (Cartas cartas : suma) {
        System.out.println(cartas.toString()); 
    }
  
}

public void Iterator () {
Iterator <Cartas> it = suma.iterator();
while(it.hasNext()) {
 Cartas x = it.next();
    System.out.println();
}

}

}


