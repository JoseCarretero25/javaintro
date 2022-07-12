/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc7peso.servicio;

import ejerc7peso.entidades.Personas;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
  Scanner leer = new Scanner (System.in).useDelimiter("\n");

public Personas CrearPersonas () {
    System.out.println("Ingrese su nombre por favor");
    String nombre = leer.next();
    System.out.println("Ingrese su edad por favor");
    int edad = leer.nextInt();
    System.out.println("Ingrese su sexo por favor");
    String sexo = leer.next();
    
    if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("O")) {
    sexo = sexo;
    } else { 
        System.out.println("El sexo ingresado es incorrecto");
    }
    System.out.println("Ingrese su peso por favor");
    double peso = leer.nextDouble();
    System.out.println("Ingrese su altura por favor");
    double altura = leer.nextDouble();
    
    return new Personas(nombre,edad,sexo,peso,altura);


}

public  double calcularIMC (Personas a) {
    double pesoideal = (a.getPeso() / Math.pow(a.getAltura(), 2) * 10000);
    
    System.out.println(pesoideal);
    if (pesoideal < 20) {
        pesoideal = -1;
        
    } else if (pesoideal >= 20 || pesoideal <= 25 ) {
       pesoideal = 0;
   
    } else if (pesoideal > 25) {
       pesoideal = 1;
    }
    System.out.println(pesoideal);
    return pesoideal;
 
    
}


public void MayorDeEdad (Personas a) {
    int mayor = 0;
    int menor = 0;
    boolean rdoedad = false;
    if (a.getEdad() >= 18) {
        
        rdoedad = true;
        mayor += 1;
       
       } else { 
        
        menor += 1;
    }
    
    System.out.println("El porcentaje de personas mayores es de : " + (mayor / (mayor + menor) + " el de menores es de : " + (menor / (mayor + menor))));
}
}
