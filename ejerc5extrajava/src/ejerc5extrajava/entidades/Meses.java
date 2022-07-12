/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5extrajava.entidades;

/**
 *
 * @author macbookair
 */
public class Meses {
    private String [] meses;

    public Meses() {
    }

    public Meses(String[] meses) {
        this.meses = meses;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + '}';
    }
    
    
}
