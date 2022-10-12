/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extrarelaciones;

import ejer4extrarelaciones.entidades.Alumno;
import ejer4extrarelaciones.servicio.Simulador;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author macbookair
 */
public class Ejer4extraRelaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Simulador sim = new Simulador();
     ArrayList <Alumno> alumnos = sim.crearAlumno();
     sim.varios();
     sim.Ranking();

     
        
     
    }
    
}
