/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc10intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc10intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int suma = 0;
        int limite = 30;
       
        do {    
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        suma += num;
                    
        }  while (suma <= limite);
         System.out.println("la suma de los numeros ingresados es: " + suma);
        
    }
    
}
