/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.manoalaobra6;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class EjercicioManoalaobra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int num1; 
       int num2;
       System.out.println("ingrese dos numeros");
       num1 = leer.nextInt();
       num2 = leer.nextInt();
       if (num1 > 25 || num2 > 25 ) {
           System.out.println("al menos uno de ellos es mayor a 25");}
       else { 
        System.out.println("Ninguno de ellos es mayor a 25"); }
       
       }
       
      
               
               
    }
    

