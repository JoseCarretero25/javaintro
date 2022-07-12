/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci10java.entidades;

/**
 *
 * @author macbookair
 */
public class Arreglos {
   private double [] A;
  

    public Arreglos() {
    }

    public Arreglos(double[] A, double[] B) {
        this.A = A;
        
    }

    public double[] getA() {
        return A;
    }

    public void setA(double[] A) {
        this.A = A;
    }

    

    @Override
    public String toString() {
        return "Arreglos{" + "A=" + A + '}';
    }
    

    
    
    
}
