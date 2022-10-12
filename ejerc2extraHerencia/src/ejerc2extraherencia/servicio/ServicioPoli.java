/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extraherencia.servicio;

import ejerc2extraherencia.entidades.Polideportivo;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioPoli {
private Scanner leer;
public ServicioPoli() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
}
public Polideportivo crearPoli (){
    boolean sintecho = false;
    System.out.println("Ingrese el nombre del Polideportivo"); 
    String nombrepoli = leer.next();
    System.out.println("El Polideportivo esta abierto si/no?");
    String respuesta = leer.next();
    if (respuesta.equalsIgnoreCase("si")) {
       sintecho = true;
    }
    double anchura = (double) (Math.random() * 100);
    double altura = (double) (Math.random() * 100);
    double largor = (double) (Math.random() * 100);
    return new Polideportivo(nombrepoli, sintecho, anchura, altura, largor);
    }
    
}
    

