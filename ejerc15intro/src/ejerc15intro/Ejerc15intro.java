/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc15intro;

/**
 *
 * @author macbookair
 */
public class Ejerc15intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int[100];
        int [] invertida = new int [100];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i;
            
        }
       llenado (vector,invertida); 
    }
    public static void  llenado(int [] vector, int [] invertida) {
        
        
        
        for (int i = 0; i < vector.length; i++) {
            invertida [i] = vector[vector.length -i -1];
            System.out.println(invertida[i]);
            
        }
     
    }    
             
}   

    
   

