/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.entidades;

/**
 *
 * @author macbookair
 */
public class Espectador {
private char nombre;
private int edad;
private int dinerodisponible;

    public Espectador() {
    }

    public Espectador(char nombre, int edad, int dinerodisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinerodisponible = dinerodisponible;
    }

    public char getNombre() {
        return nombre;
    }

    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinerodisponible() {
        return dinerodisponible;
    }

    public void setDinerodisponible(int dinerodisponible) {
        this.dinerodisponible = dinerodisponible;
    }

    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinerodisponible=" + dinerodisponible + '}';
    }

    
    
}
