/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerc1.service;

import java.util.Scanner;
import pooejerc1.entidades.Personas;

/**
 *
 * @author macbookair
 */
public class serviciopersona {
    private Scanner leer = new Scanner(System.in);
    public Personas crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();
        System.out.println("Ingrese DNI");
        String DNI = leer.nextLine();
        System.out.println("Ingrese domicilio");
        String domicilio = leer.nextLine();
        System.out.println("Ingrese edad");
        int edad = leer.nextInt();
        return new Personas(nombre, DNI, domicilio, edad);
        
        
        
    }

    
    }

