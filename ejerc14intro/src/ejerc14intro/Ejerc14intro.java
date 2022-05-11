/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc14intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejerc14intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         double [] monedas = new double [3];
         int [] euros = new int[1];
         String [] nombres = new String[3];
         for (int i = 0; i < euros.length; i++) {
             System.out.println("ingrese la cantidad de euros a conventir");
             euros[i] = leer.nextInt();
             
            
             
        }
          monedas[0] = 0.86;
          monedas[1] = 1.28611;
          monedas[2] = 129.852;
          nombres[0] = "libras";
          nombres[1] = "dolares";
          nombres[2] = "yanes";
          for (int i = 0; i < monedas.length; i++) {
             System.out.println(euros[0] + "Euros, equivalen a : " + monedas[i] * euros[0] + "   " + nombres[i]);
          }
    }
    
}
