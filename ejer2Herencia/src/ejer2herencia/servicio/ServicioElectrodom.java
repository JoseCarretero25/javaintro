/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2herencia.servicio;

import ejer2herencia.entidades.Electrodomestico;
import ejer2herencia.enumeraciones.Colores;
import ejer2herencia.enumeraciones.Letras;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioElectrodom {
private Scanner leer;
public ServicioElectrodom() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
}  
public void CrearElectrodomestico() {
  
    int precio = 1000;
    System.out.println("Cual es el color del electrodomestico?");
    String resp = leer.next();
    Colores color = Colores.valueOf(resp);
    System.out.println("Cual es la letra que representa el consumo energetico?");
    String consumo = leer.next();
    Letras letra = Letras.valueOf(consumo);
    System.out.println("Cual es el peso del producto?");
    int peso =leer.nextInt();
}
        
}
        