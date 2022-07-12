/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejerc8Frase.Servicio;

import cadena.entidades.Frase;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
   Scanner leer = new Scanner (System.in).useDelimiter("\n");
   Frase a = new Frase();
   public Frase crearFrase() {
       System.out.println("Por favor ingrese una frase");
       String Palabra = leer.nextLine();
       a.setPalabra(Palabra);
       int Long = Palabra.length();
       a.setLong(Long);
       return a;
       
       
   }
   public int mostrarVocales(Frase a) {
      int sumavocales = 0;
       String ingreso = a.getPalabra();
       int largo = a.getLong();
       for (int i = 0; i < largo ; i++) {
           String vocales = ingreso.substring(i, i + 1);
        if (vocales.equalsIgnoreCase("a") || vocales.equalsIgnoreCase("e") || vocales.equalsIgnoreCase("i") || vocales.equalsIgnoreCase("o") || vocales.equalsIgnoreCase("u")) {
            sumavocales +=1;
        }   
           
       } return sumavocales; 
   }
   public String invertirFrase(Frase a) {
       String frasealreves = "";
       String ingreso = a.getPalabra();
       int largo = a.getLong();
       int j = 0;
       for (int i = largo -1 ; i >= 0 ; i--) {
            frasealreves = ingreso.substring(largo - 1 , largo);
           largo -=1;
           System.out.println(frasealreves);
        }   
       return frasealreves;
   }
   public void vecesRepetido (Frase a) {
       int bolsaa=0;
       int bolsae=0;
       int bolsai=0;
       int bolsao=0;
       int bolsau=0;
   
       String ingreso = a.getPalabra();
       int largo = a.getLong();
       for (int i = 0; i < largo ; i++) {
           String vocales = ingreso.substring(i, i + 1);
        
           switch (vocales) {
               case "a" : 
                   bolsaa +=1; break;
               case "e" :
                   bolsae+=1; break;
               case "i" :
                   bolsai+=1; break;
               case "o" :
                   bolsao+=1; break;
               case "u" :
                   bolsau+=1; break;
           }
          
       
   }
   System.out.println("La frase tiene : " + bolsaa + " " + "vocales a ;" + " " + bolsae + "vocales e ;" + " "+ bolsai + "vocales i ;" +" "+ bolsao + "vocales o ; " + " "+ bolsau + "vocales u ; " );     
}
   public boolean compararLonguitud (Frase a) {
       String ingreso = a.getPalabra();
       boolean resultado = false;
       System.out.println("Por favor ingrese una nueva frase");
       String nuevoingreso = leer.nextLine();
       if (ingreso.length() == nuevoingreso.length()) {
           resultado = true;
           System.out.println("Las longuitudes de las frases son igual");
       } else {
           resultado = false;
           System.out.println("Las longuitudes de las frases  no son igual");
       }
       
       return resultado;
   }
   public void unirFrase (Frase a) {
       String ingreso = a.getPalabra();
       System.out.println("Por favor ingrese una nueva frase");
       String nuevoingreso = leer.nextLine();
       String union = ingreso.concat(nuevoingreso);
       System.out.println(union);
       
   }
   public void reemplzarletra (Frase a) {
       String ingreso = a.getPalabra();
       int largo = a.getLong();
       for (int i = 0; i < largo ; i++) {
           String vocales = ingreso.substring(i, i + 1);
           switch (vocales) {
               case "a" : 
                   vocales = "$"; break;
           
       
   }System.out.print(vocales);
   } 
}
   public boolean contiene (Frase a) {
       boolean incluida = false;
       String ingreso = a.getPalabra();
       int largo = a.getLong();
       for (int i = 0; i < largo ; i++) {
           String vocales = ingreso.substring(i, i + 1);
           if (vocales.equalsIgnoreCase("a")) {
               incluida = true;
              
           } else { 
               incluida = false;
               
           } 
   } return incluida;
}
}