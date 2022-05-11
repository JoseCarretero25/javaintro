/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc9manoalaobra;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc9manoalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num;
       int suma = 0;
      int conta = 0;
          
       do {
           System.out.println("Ingrese 20 numeros");
           num = leer.nextInt();
           
           
           if (num < 0 )
               continue;
           suma += num;
           conta ++;
       
       } while (num != 0);
       
       System.out.println("Se capturo el numero 0 " + "la suma de los numeros ingresados es: " + suma);
            
            
        }
           
                   
                   
          
                   
       }
    }
    

