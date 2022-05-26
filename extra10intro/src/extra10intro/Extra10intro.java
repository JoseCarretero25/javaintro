/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra10intro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Extra10intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1;
    int num2;
    int usuario;
    int multiplicacion;
    do {
        num1 = (int) (Math.random() * 10);
        
        num2 = (int) (Math.random() * 10);
        
        
        multiplicacion = num1 * num2;
         System.out.println("Cuato es el resultado de la multiplicacion?");
         usuario = leer.nextInt();
        if (multiplicacion != usuario) {
            System.out.println("El valor ingresado es incorrecto");
        }
    } while (multiplicacion != usuario);
        System.out.println("El valor ingresado es correcto");
   
    }
    
}
