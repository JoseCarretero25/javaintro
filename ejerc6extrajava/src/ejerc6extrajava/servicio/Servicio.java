/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6extrajava.servicio;

import ejerc6extrajava.entidades.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Ahorcado i = new Ahorcado();  
public Ahorcado crearJuego() {
    System.out.println("Ingrese la palabra que se buscara");
    String palabra = leer.next();
    i.setPalabra(palabra);
    int largo = palabra.length();
    i.setLargo(largo);
    System.out.println("Ingrese la cantidad de intentos que tendran");
    int intentos = leer.nextInt();
    i.setMaxintento(intentos);
    i.setEncontradas(0);
    i.setValor(intentos);
     
    
return i;
} 

public  void longitud() {
    System.out.println("La longitud es de : " + i.getLargo());
}
public  String buscar () {
    String ingreso = "";
    String [] letra = new String [i.getLargo()];
    int encontrada = 0;
    
    for (int l = 0; l < i.getLargo(); l++) {
    for (int k = 0; k < i.getLargo(); k++) {
    System.out.println("Ingrese una letra a buscar");
    ingreso  = leer.next(); break;}
    
    for (int j = 0; j < i.getValor(); j++) {
     letra [j] = i.getPalabra().substring(j, j +1);   
    if (letra[j].equalsIgnoreCase(ingreso)) {
        System.out.println("La letra es parte de la palabra en la posicion : " + j);encontrada = encontrada + 1; 
        i.setEncontradas(encontrada);
} else { System.out.println("La letra no es parte de la palabra en la posicion : " + j);
} 
     
    } 
      int faltantes = i.getLargo() - encontrada;
      int resta = i.getMaxintento() - 1;
      i.setMaxintento(resta);
    System.out.println("Numero de letras (encontradas,faltantes" + i.getEncontradas() + " " + faltantes); 
        intentos();
} return ingreso;
} 
public boolean encontrada(){
    boolean siesta = false;
    String buscar = buscar();
    int encontrada = i.getEncontradas();
    
    if (encontrada > 1) {
    siesta = true; }
    
  return siesta;  
} 
public int intentos() {
    int suma =0;
    int intentos = i.getMaxintento();
        System.out.println("Le quedan los siguientes intentos : " + i.getMaxintento()); 
        
    
    return intentos;
    }
    
public int juego () {
    int num = 0;
    if (i.getEncontradas() == i.getLargo()) {
        System.out.println("Felicitaciones! Has adivinado la palabra!!");
    } else {
        System.out.println("El juego ha terminado! vuelve a intentarlo!!");
    }
    return num;
}

} 


