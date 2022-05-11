/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercic13intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercic13intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    
    System.out.println("ingrese la dimension");
    int D = leer.nextInt();
        for (int i = 0; i < (D); i++) {
            System.out.print("*");
            
        }
         System.out.println("");
         for (int i = 0; i < D - 2; i++) {
             System.out.print("*");
             for (int a = 0; a < D - 2; a++) {
                 System.out.print(" ");
                 
             }
          System.out.println("*");
        }
         for (int i = 0; i < D; i++) {
             System.out.print("*");
             
            
        }
        }
    }
   

