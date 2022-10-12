/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1relaciones.entidades;

import video1relaciones.enumeraciones.raza;
import video1relaciones.enumeraciones.sexoaminal;

/**
 *
 * @author macbookair
 */
public class Mascotas  {
    private String Nombre;

    private int edad;



    public Mascotas() {
    }

    public Mascotas(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "Nombre=" + Nombre + ", edad=" + edad + '}';
    }

}