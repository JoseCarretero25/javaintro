/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2excepciones;

/**
 *
 * @author macbookair
 */
public class Ejerc2Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        String [] nombres = new String [10];
        for (int i = 0; i < 10; i++) {
            nombres [i + 1] = "LLENANDO" + i;
            System.out.println(nombres[i]);
        }
        
    } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Indice de arreglo fuera de rango");
    }
        
    }
    
}
