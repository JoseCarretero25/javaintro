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
public class Veleros extends Barcos {
    protected Integer mastiles;

    public Veleros() {
    }

    public Veleros(Integer mastiles) {
        this.mastiles = mastiles;
    }

    public Veleros(Integer mastiles, Integer matricula, Integer enlora, Integer anioFabricacion) {
        super(matricula, enlora, anioFabricacion);
        this.mastiles = mastiles;
    }

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
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
        return "Veleros{" + "mastiles=" + mastiles+ "matricula=" + matricula + ", enlora=" + enlora + ", anioFabricacion=" + anioFabricacion + '}';
    }
    

    @Override
    public Veleros crearBarco() {
     Integer mastiles = (int) (Math.random() * 10);   
     Integer matri = (int) (Math.random() * 100);
     Integer esloras = (int) (Math.random() * 100);
     Integer aniofabricacion = (int) (Math.random() * 1000);
     return new Veleros(mastiles, matri, esloras, aniofabricacion);
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
