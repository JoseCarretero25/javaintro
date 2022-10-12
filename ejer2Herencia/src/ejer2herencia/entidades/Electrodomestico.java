/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2herencia.entidades;

import ejer2herencia.enumeraciones.Colores;
import ejer2herencia.enumeraciones.Letras;

/**
 *
 * @author macbookair
 */
public abstract class Electrodomestico {
    protected Integer precio;
    protected Colores color;
    protected Letras letras;
    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Colores color, Letras letras, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.letras = letras;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Letras getLetras() {
        return letras;
    }

    public void setLetras(Letras letras) {
        this.letras = letras;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letras=" + letras + ", peso=" + peso + '}';
    }

    
    public abstract boolean ComprobarConsEnergetico(String letra);
    public abstract boolean comprobarColor(String color);
    public abstract Electrodomestico crearElectrodomestico();
    public abstract void precioFinal();
}
