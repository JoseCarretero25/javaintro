/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasexcepciones;

/**
 *
 * @author macbookair
 */
public class PruebasExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
           int division = 10/0;
       } catch (ArithmeticException a) {
           System.out.println("Se esta intentanto dividir por cero");
           System.out.println(a);
           System.out.println(a.fillInStackTrace());
       }
      
    }
    
}
