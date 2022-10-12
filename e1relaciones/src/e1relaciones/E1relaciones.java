/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1relaciones;

import e1relaciones.entidades.Perros;
import e1relaciones.entidades.Persona;
import e1relaciones.servicio.ServicioPersona;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class E1relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perros p1 = new Perros("Tango", "Pitbull", 8, "Mediano");
        Perros p2 = new Perros("Flopi", "salchica", 4, "Pequenio");
        ArrayList <Perros> perros = new ArrayList();
        perros.add(p1);
        perros.add(p2);
        Persona h1 = new Persona ("Jose", "Carretero", 31, 36218507, p2, perros);
        Persona h2 = new Persona("Caren", "Carretero", 26, 39601591, p1,perros);
        h1.setPerrofavorito(p1);
        h2.setPerrofavorito(p2);
        System.out.println(h1 + " ");
        System.out.println("" + h2);
        
    }
    
}
