/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4extrajava.servicio;

import ejerc4extrajava.entidades.NIF;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
Scanner leer = new Scanner (System.in).useDelimiter("\n");
public NIF crearNif () {
    System.out.println("Ingrese su DNI");
    long DNI = leer.nextLong();
    long resultado = DNI % 23;
    String letra = "";
    
    String  Letras [] = new String [23];
    for (int i = 0; i < 23; i++) {
        Letras [0] = "T";
        Letras [1] = "R";
        Letras [2] = "W";
        Letras [3] = "A";
        Letras [4] = "G";
        Letras [5] = "M";
        Letras [6] = "Y";
        Letras [7] = "F";
        Letras [8] = "P";
        Letras [9] = "D";
        Letras [10] = "X";
        Letras [11] = "B";
        Letras [12] = "N";
        Letras [13] = "J";
        Letras [14] = "Z";
        Letras [15] = "S";
        Letras [16] = "Q";
        Letras [17] = "T";
        Letras [18] = "T";
        Letras [19] = "T";
        Letras [20] = "T";
        Letras [21] = "T";
        Letras [22] = "T";
     if (resultado == i) {
        letra = Letras[i];
        
    }
    
    
}

 return new NIF (DNI , letra);   
}
public void mostrar(NIF a) {
    System.out.println(a.getDNI() + " - " + a.getLetra());
}
}
