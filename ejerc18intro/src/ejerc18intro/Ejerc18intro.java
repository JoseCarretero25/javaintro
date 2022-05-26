/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc18intro;
import java.util.Random;
/**
 *
 * @author macbookair
 */
public class Ejerc18intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] [] matriz = new int [4] [4];
        Random r = new Random();
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) r.nextInt();
                System.out.print(matriz[i][j]);
              
            }
             
            System.out.println(" ");
          
        }
         
    }

       public static void programa(int [] [] matriz) {
        
           for (int j = 0; j < matriz.length; j++) {
               for (int i = 0; i < matriz.length; i++) {
                   
                  System.out.print(matriz[i][j] * -1); 
               }
               System.out.println(" ");
           }
                
                    
                    
                    
            
                
            
            
    
    

}
} 