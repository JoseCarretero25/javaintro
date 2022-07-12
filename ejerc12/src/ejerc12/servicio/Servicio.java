/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc12.servicio;

import ejerc12.entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Persona a = new Persona();
    public Persona crearPersona () {
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de naciemiento");
        int anio = leer.nextInt();
        Date nacimiento = new Date(anio-1900,mes-1,dia);
        a.setFechanacimiento(nacimiento);
        return a;
    }
    public void calcularEdad() {
        Date hoy = new Date();
        int edad = hoy.getYear() - a.getFechanacimiento().getYear();
       
          System.out.println(edad);
    }
    public boolean compararEdades() {
        int edadP = a.getFechanacimiento().getYear();
        
        boolean mayor;
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese su anio de naciemiento");
        int anio = leer.nextInt();
        Date nuevo = new Date(anio-1900,mes-1,dia);
        a.setFechanacimiento(nuevo);
       
        if (edadP < a.getFechanacimiento().getYear()) {
            mayor = true;
        } else {
            mayor = false;
        }
        System.out.println(mayor);
        return mayor;
    }
}
