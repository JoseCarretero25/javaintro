/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas.entidades;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author macbookair
 */
public class Mascotas {
    private List <Mascotas> mascotas;
    private String nombre;
    private String apodo;
    private String tipo;
    

    public Mascotas() {
    }

    public Mascotas(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
    

    public Mascotas(List<Mascotas> mascotas, String nombre, String apodo, String tipo) {
        this.mascotas = mascotas;
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

    public List<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(List<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.mascotas);
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apodo);
        hash = 67 * hash + Objects.hashCode(this.tipo);
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
        final Mascotas other = (Mascotas) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.mascotas, other.mascotas)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "mascotas=" + mascotas + ", nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + '}';
    }

}
