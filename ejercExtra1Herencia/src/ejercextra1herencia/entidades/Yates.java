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
public class Yates extends Barcos {
    protected Integer potencia;
    protected Integer camarotes;

    public Yates() {
    }

    public Yates(Integer potencia, Integer camarotes) {
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Yates(Integer potencia, Integer camarotes, Integer matricula, Integer enlora, Integer anioFabricacion) {
        super(matricula, enlora, anioFabricacion);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
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
        return "Yates{" + "potencia=" + potencia + ", camarotes=" + camarotes + "matricula=" + matricula + ", enlora=" + enlora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    

    @Override
    public Yates crearBarco() {
     Integer potencial = (int) (Math.random() * 10000);
     Integer camarote = (int) (Math.random() * 100);
     Integer matri = (int) (Math.random() * 100);
     Integer esloras = (int) (Math.random() * 100);
     Integer aniofabricacion = (int) (Math.random() * 1000);
     return new Yates(potencial, camarote, matri, esloras, aniofabricacion);
    }

    @Override
    public ArrayList<Barcos> agregarLista() {
     ArrayList <Barcos> lista = new ArrayList();
     lista.add(this.crearBarco());
     return lista;
    }

    @Override
    public void valorAlquiler() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
