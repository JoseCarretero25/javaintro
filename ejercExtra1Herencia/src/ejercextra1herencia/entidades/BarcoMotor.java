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
public class BarcoMotor extends Barcos{
    protected Integer potencia;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(Integer potencia, Integer matricula, Integer enlora, Integer anioFabricacion) {
        super(matricula, enlora, anioFabricacion);
        this.potencia = potencia;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
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
        return "BarcoMotor{" + "potencia=" + potencia + "matricula=" + matricula + ", enlora=" + enlora + ", anioFabricacion=" + anioFabricacion+ '}';
    }
    

    @Override
    public BarcoMotor crearBarco() {
     Integer potencial = (int) (Math.random() * 10000);   
     Integer matri = (int) (Math.random() * 100);
     Integer esloras = (int) (Math.random() * 100);
     Integer aniofabricacion = (int) (Math.random() * 1000);
     return new BarcoMotor(potencial, matri, esloras, aniofabricacion);
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
