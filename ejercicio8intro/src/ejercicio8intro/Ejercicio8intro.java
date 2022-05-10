/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercicio8intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frases ;
    
        System.out.println("ingrese una frase");
        frases = leer.nextLine();
        int largo;
        largo = frases.length();
        
        
        if (largo <= 8 ){
            System.out.println("la frase ingresada es correcta");
        } else {
            System.out.println("la frase ingresada es incorrecta");
        } 
        
    }
    
}
