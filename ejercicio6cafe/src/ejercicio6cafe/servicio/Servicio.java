/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6cafe.servicio;

import ejercicio6cafe.entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Cafetera a = new Cafetera();
    
    public Cafetera llenarCafetera(double capacidadMaxima) {
       double llenar = a.getCapacidadMaxima();
       a.setCapacidadActual(llenar); 
        
       return a;
    }
    public void servirTaza() {
        
        System.out.println("Cual es el tamanio de la taza a servir");
        double taza = leer.nextInt();
   
        
        
        if ((a.getCapacidadActual() - taza <= 0) && (a.getCapacidadActual() == 0)) {
            System.out.println("El cafe se ha terminado");
            
        } else if ( a.getCapacidadActual() - taza < a.getCapacidadActual() ) {
           System.out.println("La tasa no se lleno y solo le entro : " + a.getCapacidadActual()); 
           a.setCapacidadActual(0);
        }
             
    }
        
       
       
    
    public void vaciarCafetera(double capacidadActual) {
        a.setCapacidadActual(0);
        System.out.println(a.getCapacidadActual());
    }
    public void agregarCafe (double capacidadActual) {
        System.out.println("Cual es la cantidad de cafe que desea ingresar");
        int llenado = leer.nextInt();
        a.setCapacidadActual(llenado);
        System.out.println(a.getCapacidadActual());
    }
    
    
}
