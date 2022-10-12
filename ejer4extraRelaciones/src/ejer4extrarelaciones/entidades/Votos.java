/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extrarelaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Votos {
    private Alumno alumnovota;
    private ArrayList <Alumno> alumnosAvotar;

    public Votos() {
    }

    public Votos(Alumno alumnovota, ArrayList<Alumno> alumnosAvotar) {
        this.alumnovota = alumnovota;
        this.alumnosAvotar = alumnosAvotar;
    }

    public Alumno getAlumnovota() {
        return alumnovota;
    }

    public void setAlumnovota(Alumno alumnovota) {
        this.alumnovota = alumnovota;
    }

    public ArrayList<Alumno> getAlumnosAvotar() {
        return alumnosAvotar;
    }

    public void setAlumnosAvotar(ArrayList<Alumno> alumnosAvotar) {
        this.alumnosAvotar = alumnosAvotar;
    }

    @Override
    public String toString() {
        return "Votos{" + "alumnovota=" + alumnovota + ", alumnosAvotar=" + alumnosAvotar + '}';
    }
    
    
}
