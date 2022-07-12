/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuenta.servicio;

import Cuenta.bancaria;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
  Scanner leer = new Scanner (System.in).useDelimiter("\n");
  bancaria a = new bancaria();
  public bancaria crearCuenta() {
      System.out.println("Ingrese su numero de cuenta");
      int NumCuenta = leer.nextInt();
      a.setNumeroCuenta(NumCuenta);
      System.out.println("Ingrese su DNI");
      long DNI = leer.nextLong();
      a.setDNI(DNI);
      return a;
      
  }
  public void ingresoSaldo ( int saldoActual) {
      System.out.println("Cual es la cantidad de dinero a ingresar");
      int dineroin = leer.nextInt();
      dineroin = dineroin + a.getSaldoActual();
      a.setSaldoActual(dineroin);
      System.out.println("Su saldo con el dinero ingresado es de :  " + a.getSaldoActual());
      
      
  }
  public void retirnoSaldo (int saldoActual) {
   
      if (a.getSaldoActual() <= 0) {
          System.out.println("Ud no posee dinero para retirar");
          
      }
      System.out.println("Cual es la cantidad de dinero a retirar");
      int dineroout = leer.nextInt();      
      dineroout = a.getSaldoActual() - dineroout;
      a.setSaldoActual(dineroout);
       System.out.println("Su saldo con el dinero retirado es de :  " + a.getSaldoActual());
      
      
  }
  public void retiroExtra (int saldoAcutal) {
      int nuevosaldo = 0;

      System.out.println("Cual es la cantidad de dinero extra a retirar");
      int retiroextra = leer.nextInt();
      if (retiroextra >= 0.2 * a.getSaldoActual()) {
          System.out.println("El monto excede el valor permitido");
          a.setSaldoActual(saldoAcutal);
      } else
          nuevosaldo = a.getSaldoActual() - retiroextra;
      a.setSaldoActual(nuevosaldo);
      System.out.println("Su saldo actual despues del retiro extra es de : " + a.getSaldoActual());
      }
  public void consultaSaldo(){
      System.out.println("Su saldo actual es de : " + a.getSaldoActual());
      
  }
  public void consultaDatos () {
      System.out.println("Su datos personales son : " + "Numero de cuenta" + a.getNumeroCuenta() + "DNI numero" + a.getDNI() );
      
  }
  
  
}
