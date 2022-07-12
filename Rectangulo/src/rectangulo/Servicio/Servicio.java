/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo.Servicio;

import java.util.Scanner;
import rectangulo.entidades.REntidades;

/**
 *
 * @author macbookair
 */
public class Servicio {
 Scanner leer = new Scanner (System.in).useDelimiter("\n");
 REntidades a = new REntidades();
 REntidades b = new REntidades();
 public REntidades ingresebase() {
     System.out.println("Ingrese la base del rectangulo a calcular");
     int base = leer.nextInt();
     a.setBase(base);
     return a;
 }
 public REntidades ingresAltura() {
     System.out.println("Ingrese la altura del rectangulo a calcular");
     int altura = leer.nextInt();
     b.setAltura(altura);
     return b;
 }
 public void Superficie() {
     int superficie = a.getBase() * b.getAltura();
     System.out.println("La superfice del rectangulo es de : " + superficie);
 }
 public void Perimetro() {
     int perimetro = (a.getBase() + b.getAltura()) * 2;
     System.out.println("La superfice del rectangulo es de : " + perimetro);
 }
 public void Dibujo(){
     for (int i = 0; i < (a.getBase()); i++) {
            System.out.print("*");
            
        }
         System.out.println("");
         int d = a.getBase() - b.getAltura() - 2;
         for (int i = 0; i < b.getAltura()- 2; i++) {
             System.out.print("*");
             for (int a = 0; a < b.getAltura() + d ; a++) {
                 System.out.print(" ");
                 
             }
          System.out.println("*");
        }
         for (int i = 0; i < a.getBase(); i++) {
             System.out.print("*");
             
            
        }
 }
 
}
