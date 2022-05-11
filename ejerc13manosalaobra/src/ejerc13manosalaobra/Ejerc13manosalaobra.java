/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc13manosalaobra;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc13manosalaobra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] vector = new String [5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("ingrese los nombres de su equipo");
            vector[i] = leer.nextLine();
            
        }
        for (int i = 0; i < vector.length; i++) {
        System.out.print(vector[i]);
        System.out.println("");
    }
   
    }

}