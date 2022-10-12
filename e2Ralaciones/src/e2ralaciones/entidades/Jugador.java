/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Jugador {
 private double id;
 private String nombre;
 private boolean mojado;
 private int cantidad;
 private ArrayList <Jugador> jugador;
 

    public Jugador() {
    }

    public Jugador(double id, String nombre, boolean mojado, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;
        this.cantidad = cantidad;
    }

    public Jugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }
    

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + ", cantidad=" + cantidad + '}';
    }

}