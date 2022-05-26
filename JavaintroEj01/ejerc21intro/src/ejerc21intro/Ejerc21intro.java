/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc21intro;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc21intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int [] [] matriz10 = new int [5][5];
        int [] [] matriz3 = new int [3][3];
        int k = matriz3.length - 1;
        int i1= 0;
        int i2 = 0;
        int i3 = 0;
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int fila = 0;
        int columna = 0;
        String bolsa1 = "";
        String bolsa2 = "";
        String bolsa3 = "";
        int m =0;
        int cont = 0;
        
        
                for (int i = 0; i < matriz10.length; i++) {
            for (int j = 0; j < matriz10.length; j++) {
                
                matriz10 [i] [j] = m;
                
                System.out.print(matriz10[i][j]);
                m += 1;
                
               
                
            }
            System.out.println(" "); 
        }
        m=0;
        
         for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {
                
                matriz3 [i] [j] = m + 12;
                
                System.out.print(matriz3[i][j]);
                m+=1;
              
               
                
            }
           System.out.println(" ");  
         }
         
         
          for (int i = 0; i < matriz10.length; i++) {
          for (int j = 0; j < matriz10.length; j++) {
          
                      
            
              if (matriz3[0][0] == matriz10[i][j] || (matriz3[0][1] == matriz10[i][j]) || (matriz3[0][2] == matriz10[i][j])) {
                  i1 = i;
                  j1= j;
                  bolsa1 += "fila" + "  " + i1 + "columna" + "  " +  j1;
                  
                 
                 
                  
              } if   
                  (matriz3[1][0] == matriz10[i][j] || (matriz3[1][1] == matriz10[i][j]) || (matriz3[1][2] == matriz10[i][j])) {  
                  i2 =i;
                  j2 =j;
                  bolsa2 += "fila" + "  " + i2 + "columna"+ "  " + j2;
                  
                  
                   
                  
              }  if
              
              (matriz3[2][0] == matriz10[i][j] ||(matriz3[2][1] == matriz10[i][j]) || (matriz3[2][2] == matriz10[i][j])) {
                  i3 = i;
                  j3 = j;
                  bolsa3 += "fila" + "  " + i3 + "columna" + "  " + j3;
                  
                  
              }
              
             
              }
         }
         if (bolsa1.length() == bolsa2.length() && bolsa2.length() == bolsa3.length()) 
         System.out.println("en las posiciones siguientes las matrices son iguales : " + bolsa1);
         System.out.println("en las posiciones siguientes las matrices son iguales : "+ bolsa2);
         System.out.println("en las posiciones siguientes las matrices son iguales : "+ bolsa3);
    }
          
         

         }


    
         
         
              
          
                
                  
                 
                  
              
          
         
          

 


    
        
    
         
 

         
          