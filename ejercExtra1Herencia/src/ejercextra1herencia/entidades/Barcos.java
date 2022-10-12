/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercextra1herencia.entidades;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public  abstract class Barcos {
    protected Integer matricula;
    protected Integer enlora;
    protected Integer anioFabricacion;

    public Barcos() {
    }

    public Barcos(Integer matricula, Integer enlora, Integer anioFabricacion) {
        this.matricula = matricula;
        this.enlora = enlora;
        this.anioFabricacion = anioFabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Integer getEnlora() {
        return enlora;
    }

    public void setEnlora(Integer enlora) {
        this.enlora = enlora;
    }

    public Integer getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(Integer anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Barcos{" + "matricula=" + matricula + ", enlora=" + enlora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    
    public abstract Barcos crearBarco();
    public abstract ArrayList <Barcos> agregarLista();
    public abstract void valorAlquiler();
    
}
