/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra17.bisintro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Extra17Bisintro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1;
       boolean primo = false;
       int division = 0;
       

        System.out.println("Ingrese el numero a determninar si es primo");
        num1 = leer.nextInt();
        dividir(num1,primo,division);
        
    }
 public static boolean dividir (int num1, boolean primo,int division) {
       
     int cont = 0; 
     int i = 0;
     
     do{
         i +=1;
         
         division = num1 % i;
         
         if (division == 0) {
            cont+=1; 
         } 
        
         
                 
         
     } while (i <= 100);
         
     System.out.println(cont);
        if (cont == 2)
                {
        primo = true;
            System.out.println("El numero es primo"); 
    }
        
         else { 
                primo = false;
                System.out.println("El numero no es primo");       
                
                }
        
        return primo;
         }
         }
    
     
                
    
         
