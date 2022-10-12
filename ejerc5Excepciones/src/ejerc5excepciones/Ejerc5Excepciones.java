/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejerc5Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int cont = 0;
       try {
       Scanner leer = new Scanner (System.in).useDelimiter("\n");
       int escondido = (int) (Math.random() * 500);
       int ingreso = 0;
       System.out.println(escondido);
        do {
           System.out.println("Ingrese un numero a adivinar");
           ingreso = leer.nextInt();
            if (ingreso == escondido) {
                cont+=1;
                break;
            } else {
                System.out.println("No es el numero");
                cont+=1;
                if(ingreso > escondido) {
                    System.out.println("El numero ingresado es menor");
                } else {
                    System.out.println("El numero ingresado es mayor");
                }
            }
            
        } while (ingreso != escondido);
        System.out.println("La cantidad de intentos es de : " + cont); 
    } catch (InputMismatchException a) {
           System.out.println("No ha ingresado un numero, el juego ha terminado");
           cont+=1;
           System.out.println("La cantidad de intentos es de :" + cont);
    }
    
}
}