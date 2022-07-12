/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc11manosalaobra;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejerc11manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        String acumulado = "";
        String resultado;
        
        do{
        System.out.println("Ingrese una secuencia de palabras");
        frase = leer.nextLine();
        acumulado += frase;
        if (frase.equals(".")) {
            break;
        }
        
    } while (frase != ".");
        
        reemplo (acumulado);
        
        
       
    }
    
   public static String reemplo (String acumulado) { 
       String nuevafrase;
       String letras = "";
       int j = 1;
       for (int i = 0; i < acumulado.length() - 1 ; i++) {
           letras = acumulado.substring(i, j);
           
           j++;
          switch (letras) {
              case "a":
                  letras = "!"; break;
              case "e":
                  letras = "#"; break;
              case "i":
                  letras = "%"; break;
              case "o": 
                  letras = "&"; break;
              case "u":
                  letras = "$"; break;
                               
          } 
            System.out.print(letras);
             
       }
      
         

        return letras;
 
}

}