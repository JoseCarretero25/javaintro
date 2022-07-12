/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc12manoalaobra;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejerc12manoalaobra {

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
        
        multiplo(num1,num2);
       
        
    }
    public static void multiplo(int num1, int num2) {
        if (num1 % num2 == 0) {  
            System.out.println(num1 + " " + "es multiplo de  :" + num2);
        } else
            System.out.println(num1 + "no es multiplo de : " + num2);
        }
    }
            
