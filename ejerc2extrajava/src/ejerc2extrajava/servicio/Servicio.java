/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extrajava.servicio;

import ejerc2extrajava.entidades.Puntos;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Puntos a = new Puntos();
    public Puntos crearPuntos(){
        System.out.println("Ingrese cuatro numeros");
        int x1 = leer.nextInt();
        a.setX1(x1);
        int x2 = leer.nextInt();
        a.setX2(x2);
        int y1 = leer.nextInt();
        a.setY1(y1);
        int y2 = leer.nextInt();
        a.setY2(y2);
        
        return a;
    }
    public void distanciaPuntos(){
        double restax = (a.getX2() - a.getX1());
        double restay = (a.getY2() - a.getY1());
        double potenciax = Math.pow(restax, 2);
        double potenciay = Math.pow(restay, 2);
        double distancia = Math.sqrt(restax + restay);
        System.out.println("La distancia entre los puntos ingresados es de : " + distancia);
        
    }
    
}
