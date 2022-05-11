/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc10manoalaobra;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc10manoalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int num2;
       int num3;
       int num4;
       String cont = "*";
       String cont2 = "*";
       String cont3 = "*"; 
       String cont4 = "*";
       
       System.out.println("Ingrese 4 numeros");
           num1 = leer.nextInt();
           num2 = leer.nextInt();
           num3 = leer.nextInt();
           num4 = leer.nextInt();
           
        
        for (int i = 0; i < num1 - 1; i++) {
         cont += "*";
        }
      System.out.println(num1 + cont);
      for (int i = 0; i < num2 - 1; i++) {
         cont2 += "*";
        }
      System.out.println(num2 + cont2);
      for (int i = 0; i < num3 - 1; i++) {
         cont3 += "*";
        }
      System.out.println(num3 + cont3);
      for (int i = 0; i < num4 - 1; i++) {
         cont4 += "*";
        }
      System.out.println(num4 + cont4);
      
    }
    }
    

