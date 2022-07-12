

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerc1.entidades;

/**
 *
 * @author macbookair
 */
public class Personas {
    public String nombre;
    private String DNI;
    private String domicilio;
    private int edad;
    private int energia;
    
    
    public Personas(String nombre, String DNI, String domicilio, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.domicilio = domicilio;
        this.edad = edad;
        this.energia = 1000;
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getNombre () {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getEdad() {
        return edad;
    }
    
   
    public int pasear( int energiarestar) {
        energia -= energiarestar;
        
        return energia;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", DNI=" + DNI + ", domicilio=" + domicilio + ", edad=" + edad + ", energia=" + energia + '}';
    }

   

}


