/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc11intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc11intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num1;
     int num2;
     int opciones;
    
    String salir = "n" ;
     
     System.out.println("ingrese dos numeros");
     num1 = leer.nextInt();
     num2 = leer.nextInt();
             
     
     do {
     System.out.println("Menu: ");
     System.out.println("1. SUMAR "); 
     System.out.println("2. RESTAR ");
     System.out.println("3. MULTIPLICAR ");
     System.out.println("4. DIVIDIR ");
     System.out.println("5. SALIR ");
     opciones = leer.nextInt();
     
     
     switch (opciones) {
         case 1 :
            System.out.println( "La suma es de : " + (num1 + num2)); break;
         case 2:
             System.out.println( "La resta es de : " + (num1 - num2)); break;
         case 3:
             System.out.println( "La multiplicacion es de : " + (num1 * num2)); break;
         case 4:
             System.out.println( "La division es de : " + (num1 / num2)); break;
         case 5:
             System.out.println( "Esta seguro que desea salir?");
             salir = leer.next();
             if (salir.equalsIgnoreCase("s")) {
                 break;
             }
             
              
               
     }         
                  
               
      } while (salir.equals("n")); 
     
    
     }
}
     
     
    
    
    
     

     

   

