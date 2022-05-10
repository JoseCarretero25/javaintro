/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercicio6intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
         int num1;
        
         System.out.println("ingrese un numero");
         
         num1 = leer.nextInt();
         
         if ((num1 % 2) == 0 ) {
        System.out.println("el numero ingresado es par"); 
    } else {
     
      System.out.println("el numero ingresado es impar");}
    }
    
    
}
