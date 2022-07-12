/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5extrajava.servicio;

import ejerc5extrajava.entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
Scanner leer = new Scanner (System.in).useDelimiter("\n");
public Meses llenarVector(){
    String [] meses = new String [12];
    for (int i = 0; i < 12; i++) {
        meses[0] = "Enero";
        meses[1] = "Febrero";
        meses[2] = "Marzo";
        meses[3] = "Abril";
        meses[4] = "Mayo";
        meses[5] = "Junio";
        meses[6] = "Julio";
        meses[7] = "Agosto";
        meses[8] = "Septiembre";
        meses[9] = "Octubre";
        meses[10] = "Noviembre";
        meses[11] = "Diciembre";
    }
   return new Meses(meses);
}
public void comprobarMes(Meses a) {
  String mesi;
  for (int i = 0; i < 12; i++) {
  String [] meses = a.getMeses();
  String mesoculto = meses [6]; 
  
  do {
  System.out.println("Ingrese el mes a adivinar");
  mesi = leer.nextLine();    
  if (mesi.equalsIgnoreCase(mesoculto)) {
      System.out.println("Ha adivinado el mes!! "); break;
  } else { 
      System.out.println("No lo ha adivinado! vulva a intentarlo");
      mesi = leer.nextLine();
  }
} while (!mesi.equalsIgnoreCase(mesoculto)); break;
  
  }
    
}
}
