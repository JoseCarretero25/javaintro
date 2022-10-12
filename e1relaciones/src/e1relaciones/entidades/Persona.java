/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1relaciones.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long DNI;
    private Perros perrofavorito;
    private ArrayList <Perros> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        
    }

    public Persona(String nombre, String apellido, int edad, long DNI, Perros perrofavorito, ArrayList<Perros> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perrofavorito = perrofavorito;
        this.perros = perros;
    }

    
    

    public Perros getPerrofavorito() {
        return perrofavorito;
    }

    public void setPerrofavorito(Perros perrofavorito) {
        this.perrofavorito = perrofavorito;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Perros> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<Perros> perros) {
        this.perros = perros;
    }
    
    @Override
    public String toString() {
          
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI + ", perrofavorito=" + perrofavorito + ", perros=" + perros + '}';
    }

   

   
    
    
}
