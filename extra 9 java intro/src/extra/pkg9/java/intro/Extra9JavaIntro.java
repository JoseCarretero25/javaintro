/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg9.java.intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Extra9JavaIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int divisor;
        int resto = 0;
        int dividendo;
        int i = 0;
        System.out.println("Escriba dividendo");
        dividendo = leer.nextInt();
        resto = dividendo;
        System.out.println("Escriba un divisor");
        divisor = leer.nextInt();
        
        do {
            resto = resto - divisor;
            i+=1;
            
        } while (resto > divisor);        
            
           System.out.println("El resto es : " + resto + "el cociente es : " + i); 
                    
        }
        
    }
    

