/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.entidades;

import ejextra2relaciones.enumeraciones.LetrasSalas;

/**
 *
 * @author macbookair
 */
public class Sala {
    private int numerodeasiento;
    private LetrasSalas letrasala;
    private String ocupado;

    public Sala() {
    }

    public Sala(int numerodeasiento, LetrasSalas letrasala, String ocupado) {
        this.numerodeasiento = numerodeasiento;
        this.letrasala = letrasala;
        this.ocupado = ocupado;
    }

    public int getNumerodeasiento() {
        return numerodeasiento;
    }

    public void setNumerodeasiento(int numerodeasiento) {
        this.numerodeasiento = numerodeasiento;
    }

    public LetrasSalas getLetrasala() {
        return letrasala;
    }

    public void setLetrasala(LetrasSalas letrasala) {
        this.letrasala = letrasala;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Sala{" + "numerodeasiento=" + numerodeasiento + ", letrasala=" + letrasala + ", ocupado=" + ocupado + '}';
    }
    
    
}
