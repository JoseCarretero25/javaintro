/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc8manoalaobra;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejerc8manoalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("ingrese un numero entre 0 y 10");
        num1 = leer.nextInt();
        while (num1 <= 0 || num1 >= 10) {
            System.out.println(" el numero ingresado no esta entre 0 y 10, vuelva a ingresar otro");
            num1 = leer.nextInt();
        }
   System.out.println("el numero ingresado esta entre 0 y 10 y es: " + num1);
    } 
    
    
 
}
