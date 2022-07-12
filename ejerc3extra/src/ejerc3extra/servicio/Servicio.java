/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extra.servicio;

import ejerc3extra.entidades.Raices;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public Raices IngresarValores(){
        System.out.println("Ingrese los valores para la variable a");
        int a = leer.nextInt();
        System.out.println("Ingrese los valores para la variable b");
        int b = leer.nextInt();
        System.out.println("Ingrese los valores para la variable c");
        int c = leer.nextInt(); 
        return new Raices(a , b, c);
    }
    public double getDiscriminante (Raices f) {
        double variables = f.getA(); 
        double discriminante = Math.pow(variables,2) - 4 * f.getA() * f.getB();
        System.out.println(discriminante);
        return discriminante;
    }
    public boolean tieneRaices(Raices f) {
        double discriminante  = getDiscriminante(f);
        boolean dosraices;
        if (discriminante >= 0) {
          dosraices = true;  
        } else {
        dosraices = false;
    }
        return dosraices;
}
    public boolean tieneRaiz(Raices f) { 
    double discriminante  = getDiscriminante(f);
    boolean unicaraiz;
    if (discriminante == 0) {
          unicaraiz = true;  
        } else {
        unicaraiz = false;
        
    } return unicaraiz;
    
}
    public void obtenerRaices (Raices f) {
    boolean obtener = tieneRaices(f);
    double discriminante = getDiscriminante(f);
    if (obtener == true) {
        System.out.println(discriminante);
    } else {
        System.out.println("Solo tiene una raiz");
    }
    }
    public void obtenerRaiz (Raices f) {
      boolean obtenerraiz = tieneRaiz(f);
      double rdo  = getDiscriminante (f);
      double discriminante = getDiscriminante(f);
      if (obtenerraiz == true) {
          System.out.println(discriminante);
      }
    }
    
}