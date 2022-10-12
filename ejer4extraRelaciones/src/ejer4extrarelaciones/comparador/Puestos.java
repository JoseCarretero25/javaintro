/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extrarelaciones.comparador;

import ejer4extrarelaciones.entidades.Alumno;
import java.util.Comparator;

/**
 *
 * @author macbookair
 */
public class Puestos {
    public static Comparator <Alumno> ordenardes = new Comparator <Alumno>() {
        @Override
        public int compare(Alumno o1, Alumno o2) {
           return o2.getVotos().compareTo(o1.getVotos());
        }
        
    } ;
    
}
