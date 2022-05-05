/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5intro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejercicio5intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int num1 = leer.nextInt();
        
        System.out.println("El doble del numero ingresado es  : " + (num1 * num1) + "El triple del numero ingresado es:  :" + (num1 * num1 * num1) + "la raiz cuadrada del numero ingresado es : " + (Math.sqrt(num1)));
    }
    
}

