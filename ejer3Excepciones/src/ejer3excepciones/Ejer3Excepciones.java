/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3excepciones;

import static java.lang.System.in;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Ejer3Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese dos numeros");
        String num1 = leer.nextLine();
        String num2 = leer.nextLine();
        int num3 = leer.nextInt();
        int numero1 = Integer.valueOf(num1);
        int numero2 = Integer.valueOf(num2);
        int division = numero1/numero2;
        System.out.println("La division de : " + numero1 + " " + "por" + " "+ numero2 + "es : " + division);
        
    } catch (InputMismatchException a) {
            System.out.println("Error de teclado");
    } catch (NumberFormatException b) {
            System.out.println("No pudo convertirse la cadena a entero");
    }catch (ArithmeticException c) {
            System.out.println("Esta intentando dividir por cero");
    }
        
    }
    
}
