/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc20intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc20intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.err.println("Ingrese la dimension de la matriz a calcular");
        int i = leer.nextInt();
        int j = leer.nextInt();
        int suma = 0;
        int suma2 = 0;
        int [] [] matriz = new int [i][j];
        int tamano = matriz.length; 
        int tamano2 = matriz.length;        
        int compa = 0;
        int compa2 = 0;
        int iguales = 0;
        int iguales2 = 0;
        int valor = 0;
        int suma3 = 0;
        int suma4 = 0;
        
       
        for (int k = 0; k < matriz.length ; k++) {
            for (int l = 0; l < matriz.length  ; l++) {
                matriz[k][l] = leer.nextInt();
                
               
            }
           
        }
        for (int k = 0; k < matriz.length ; k++) {
            for (int l = 0; l < matriz.length  ; l++) {
                
                System.out.print(matriz[k][l]);
               
            }
            System.out.println(" ");
        }
          for (int k = 0; k < matriz.length ; k++) {
           
                
                
                valor += matriz[k][0];
               
            }
            
          
           
           do { 
             tamano -= 1;
              suma = 0;
             
             
        for (int k = 0; k < matriz.length; k++) {
            for (int l = 0; l < matriz.length; l++) {

            if (l == tamano) {
                suma+= matriz[k][l];break;
            }     
            
            }
           
        } 
         
        
         if (suma == valor) {
            iguales += 1;
           
             
        

        }
 
    }  while (tamano >= 0) ;
         
    
           
           
         do { 
             tamano2 -= 1;
             
               suma2 = 0; 
        
        for (int l = 0; l < matriz.length; l++) {
            for (int k = 0; k < matriz.length; k++) {
            
            
            
            if (k == tamano2) {
                suma2+= matriz[k][l];break;

            }     
                      
            }
           
        } 
         
       
        if ((suma2) == valor) {
            iguales2 += 1;
            
            
        }

    }  while (tamano2 >= 0) ;
   
      
      for (int k = 0; k < matriz.length ; k++) {
           
                
               
                suma3 += matriz[k][k];
               
            }
           
            
             for (int k = 0; k < matriz.length ; k++) {
            for (int l = 0; l < matriz.length  ; l++) {
                if ((k == 0 && l == matriz.length -1 ) || (k == matriz.length - 1 && l == 0) || (k == matriz.length -1 - l && l == matriz.length - 1 - k)) {
                suma4 += matriz[k][l];
                    
               
            }
           
        }
            
            
        }
      
      if (iguales == matriz.length && iguales2 == matriz.length && suma3 == valor && suma4 == valor) {
          System.out.println("La matriz es cuadrada");
      } else
            System.out.println("La matriz no es cuadrada");
    } 

}      
    
