/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci10java.servicio;

import ejerci10java.entidades.Arreglos;
import java.util.Arrays;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Arreglos a = new Arreglos();
    
    public Arreglos llenarVector(Arreglos a) {
    double [] A = new double [50];
        for (int i = 0; i < A.length; i++) {
            A[i] = Math.random() * 10;
            a.setA(A);
            System.err.print(A[i]);
           
        }
        
        return a;
    }
    public void OrdenarVactorA(Arreglos a) {
     for (int i = 0; i < 50; i++) {
            double [] C = a.getA();
            Arrays.sort(C); 
            System.err.println("      " + C[i]);  
        }    
    }
    public void llenadoVectorB (Arreglos a) {
    for (int i = 0; i < 20; i++) {
            double [] C = a.getA();
            Arrays.fill(C, 10, 20, 0.50); 
            System.err.print("      " + C[i]);     
    }
        }
}
        
    
 
   
    
