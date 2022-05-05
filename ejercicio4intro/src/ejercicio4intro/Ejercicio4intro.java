/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4intro;
import java.util.Scanner;
/**
 *
 * @author macbookair
 */
public class Ejercicio4intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una cantidad de grados");
        double C = leer.nextDouble();
        double F = 32 + (9 * C / 5);
        System.out.println("la cantidad equivalente de grados :" + C + "Es en Fharenheit es :" + F);
        
    }
    
}100
