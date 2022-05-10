/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercicio7intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frases ;
        String correcta;
        System.out.println("ingrese una frase");
        frases = leer.nextLine();
        correcta = "eureka";
        if (frases.equals(correcta)){
            System.out.println("la frase ingresada es correcta");
        } else {
            System.out.println("la frase ingresada es incorrecta");
        } 
        
        
        
    }
    
}
