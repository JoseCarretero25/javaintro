/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci1poo2.entidades;

import java.util.Objects;

/**
 *
 * @author macbookair
 */
public class Razas implements Comparable<Razas> {
    private String razar;

    public Razas() {
    }

    public Razas(String razar) {
        this.razar = razar;
    }

    public String getRazar() {
        return razar;
    }

    public void setRazar(String razar) {
        this.razar = razar;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.razar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Razas other = (Razas) obj;
        if (!Objects.equals(this.razar, other.razar)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Razas{" + "razar=" + razar + '}';
    }

    @Override
    public int compareTo(Razas o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int Comparato (Razas o) {
        return o.razar.compareTo(this.razar);
    }
}
