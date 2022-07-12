/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc9java.servicio;

import ejerc9java.entidades.Matematica;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
  Scanner leer = new Scanner (System.in).useDelimiter("\n");
  public Matematica cargarNumeros () {
  double num1 = (double) Math.random() * 10;
  double num2 = (double) Math.random() * 10;
  return new Matematica(num1, num2);
  }
  public double retornarMayor (Matematica a) {
      double rdonum1 = a.getNum1();
      double rdonum2 = a.getNum2();
      double mayor = Math.max(rdonum1, rdonum2);
      System.out.println( (rdonum1) + " " + (rdonum2) + " " + mayor);
      return mayor;
  }
  public void calcularPotencia (Matematica a) {
      double rdonum1 = Math.floor(a.getNum1()) ;
      double rdonum2 = Math.floor(a.getNum2()) ;
      double mayor = Math.max(rdonum1, rdonum2);
      double menor = Math.min(rdonum1, rdonum2);
      double potencia = Math.pow(mayor, menor);
      
      
  }
  public void calcularRaiz(Matematica a) {
   double rdonum1 = a.getNum1() ;
   double rdonum2 = a.getNum2() ;
   double menor = Math.min(rdonum1, rdonum2);
   double valorabs = Math.abs(menor);
   double raiz = Math.sqrt(menor);
      System.out.println(raiz);
  }
   
    
}
