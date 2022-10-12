/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.entidades;

/**
 *
 * @author macbookair
 */
public class Peliculas {
 private String titulo;
 private int duracion;
 private int edadminima;
 private int director;

    public Peliculas() {
    }

    public Peliculas(String titulo, int duracion, int edadminima, int director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadminima = edadminima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadminima() {
        return edadminima;
    }

    public void setEdadminima(int edadminima) {
        this.edadminima = edadminima;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadminima=" + edadminima + ", director=" + director + '}';
    }
 
}
