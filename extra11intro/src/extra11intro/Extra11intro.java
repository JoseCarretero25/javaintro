/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra11intro;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Extra11intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1;
       int i = 0;
       int resultado = 0;
        System.out.println("Ingrese el numero a determninar sus digitos");
        num1 = leer.nextInt();
        
        do {
            
             i+= 1;
            
            resultado = num1 / 10;
            num1 = resultado;
            
           
            
            
            
            
        } while (resultado > 0);
        System.out.println("La cantidad de digitos es : " + i);
    }
    
}
