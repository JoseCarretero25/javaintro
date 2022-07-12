/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc12intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc12intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letras;
        String primera;
        String ultima;
        int sumai = 0;
        int sumac = 0;
        String salida = "&&&&&";
        
        do {
            System.out.println(" Ingrese las cadenas a procesar");
            letras = leer.nextLine();
            int largo = letras.length();
            primera = letras.substring(0,1);
            ultima = letras.substring(largo - 1, largo);
           
            if (largo <= 5) {
                
                if ((primera.equalsIgnoreCase("X")) && (ultima.equalsIgnoreCase("O"))) {
                    sumac++; }
                    else { 
                    sumai++;
                }
                if (letras.equals(salida)) {
                    break;
                    
                }
            }
        } while (sumac <= 10);
        System.out.println("las correctas ingresadas son : " + sumac + "las incorrectas ingresadas son : " + sumai);
    }
    
}
