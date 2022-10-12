/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Cine {
    private Peliculas pelicula;
    private ArrayList <Sala> sala;
    private int precio;

    public Cine() {
    }

    public Cine(Peliculas pelicula, ArrayList<Sala> sala, int precio) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precio = precio;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Sala> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Sala> sala) {
        this.sala = sala;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "pelicula=" + pelicula + ", sala=" + sala + ", precio=" + precio + '}';
    }

    
    
}
