/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercextra1herencia.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author macbookair
 */
public class Alquiler {
    private String nombre;
    private float DNI;
    private Date fechaalquiler;
    private Date fechadevolcion;
    private Integer posicionamarre;
    private ArrayList <Barcos> barcoscreados;

    public Alquiler() {
    }

    public Alquiler(String nombre, float DNI, Date fechaalquiler, Date fechadevolcion, Integer posicionamarre) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaalquiler = fechaalquiler;
        this.fechadevolcion = fechadevolcion;
        this.posicionamarre = posicionamarre;
    }
    

    public Alquiler(String nombre, float DNI, Date fechaalquiler, Date fechadevolcion, Integer posicionamarre, ArrayList<Barcos> barcoscreados) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaalquiler = fechaalquiler;
        this.fechadevolcion = fechadevolcion;
        this.posicionamarre = posicionamarre;
        this.barcoscreados = barcoscreados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getDNI() {
        return DNI;
    }

    public void setDNI(float DNI) {
        this.DNI = DNI;
    }

    public Date getFechaalquiler() {
        return fechaalquiler;
    }

    public void setFechaalquiler(Date fechaalquiler) {
        this.fechaalquiler = fechaalquiler;
    }

    public Date getFechadevolcion() {
        return fechadevolcion;
    }

    public void setFechadevolcion(Date fechadevolcion) {
        this.fechadevolcion = fechadevolcion;
    }

    public Integer getPosicionamarre() {
        return posicionamarre;
    }

    public void setPosicionamarre(Integer posicionamarre) {
        this.posicionamarre = posicionamarre;
    }

    public ArrayList<Barcos> getBarcoscreados() {
        return barcoscreados;
    }

    public void setBarcoscreados(ArrayList<Barcos> barcoscreados) {
        this.barcoscreados = barcoscreados;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", DNI=" + DNI + ", fechaalquiler=" + fechaalquiler + ", fechadevolcion=" + fechadevolcion + ", posicionamarre=" + posicionamarre + ", barcoscreados=" + barcoscreados + '}';
    }
    

    
    
    
}
