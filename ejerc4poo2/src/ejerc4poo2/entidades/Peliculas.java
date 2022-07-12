/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc4poo2.entidades;

/**
 *
 * @author macbookair
 */
public class Peliculas {
 private String Titulo;
 private String Director;
 private Integer duracion;

    public Peliculas() {
    }

    public Peliculas(String Titulo, String Director, Integer duracion) {
        this.Titulo = Titulo;
        this.Director = Director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "Titulo=" + Titulo + ", Director=" + Director + ", duracion=" + duracion + '}';
    }
 
    
}
