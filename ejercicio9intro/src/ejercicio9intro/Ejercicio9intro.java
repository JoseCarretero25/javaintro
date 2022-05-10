/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercicio9intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        String frases ;
        String letra;
        System.out.println("ingrese una frase");
        frases = leer.nextLine();
       
        if (frases.substring(0,1).equals("a") || frases.substring(0,1).equals ("A") ) {
            System.out.println("la frase comienza con a");
        } else {
            System.out.println("la frase ingresada no comienza con a");
        } 
       
    }
    
}
