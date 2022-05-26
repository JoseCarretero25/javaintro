/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc16intro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejerc16intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1 = 0;
       int [] vector = new int [10];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
           System.out.println(vector[i]);
            
        }
        System.out.println("ingrese un numero"); 
            num1 = leer.nextInt();
        for (int i = 0; i < vector.length; i++) {
            if (num1 ==vector[i]) {
                System.out.println("el numero ingresado se encuentra en la posicion: "+ i);
                
            }
        }
       
        
    }
    
}
