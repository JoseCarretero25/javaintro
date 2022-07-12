/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer23intro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejer23intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String frase;
       String fraseok = "";
       int cont = 1;
       int c = 0;
       int d = 1;
       
       String [][] matriz = new String [5][5];
       int [] [] matriznum = new int [20][20];
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = "*";
                matriznum[i][j] = (int) (Math.random() * 10);
            }
            
        }
       
       
       do {
           
           System.out.println("Ingrese una palabra");
           frase = leer.nextLine();
           
           
           for (int i = 0; i <  matriz.length - frase.length()  + 1; i++) {
               frase+= (int) (Math.random()* 10);
               
           }
           fraseok += frase;
        
         cont+=1;  
            
           
           
       } while (cont <= 5);
       
        System.out.println(fraseok);
        
        
            for (int i = 0; i < matriz.length ; i++) {
           for (int j = 0; j < matriz.length; j++) {
            matriz[i][j] = fraseok.substring(c,d);
            c+=1;
            d+=1;
               System.out.print(matriz[i][j]); 
               
           }
                System.out.println(" "); 
       }
           
       
       
       
      
       
       
       
       
    }
    
}
