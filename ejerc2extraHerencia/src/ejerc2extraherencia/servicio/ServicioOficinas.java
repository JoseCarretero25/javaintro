/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extraherencia.servicio;

import ejerc2extraherencia.entidades.Oficinas;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioOficinas {
private Scanner leer;
public ServicioOficinas() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
}
public Oficinas crearOficinas(){
    System.out.println("Cual es el numero de oficinas?");
    Integer cOficinas = leer.nextInt();
    System.out.println("Cual es la cantidad maxima de personas por oficinas?");
    Integer cPersonas = leer.nextInt();
    System.out.println("Cual es el numero de pisos?");
    Integer cPisos = leer.nextInt();
    double anchura = (double) (Math.random() * 100);
    double altura = (double) (Math.random() * 100);
    double largor = (double) (Math.random() * 100);
    return new Oficinas (cOficinas, cPersonas, cPisos, anchura, altura, largor);
    
}
public void cantPersonas(Oficinas a) {
    System.out.println("La cantidad de personas que entran por piso es de : " + a.getPersonasporOficina());
    System.out.println("La cantidad de personas que entrar por edificio es de: " + (a.getPisos()* a.getPersonasporOficina()));
}
    
    
}
