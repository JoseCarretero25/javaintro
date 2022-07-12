/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc5poo2.entidades;

import java.util.Objects;

/**
 *
 * @author macbookair
 */
public class Paises implements Comparable <Paises>{
    private String Pais;

    public Paises() {
    }

    public Paises(String Pais) {
        this.Pais = Pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.Pais);
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
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.Pais, other.Pais)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paises{" + "Pais=" + Pais + '}';
    }

    @Override
    public int compareTo(Paises o) {
        return this.getPais().compareTo(o.getPais());
    }

    
}
