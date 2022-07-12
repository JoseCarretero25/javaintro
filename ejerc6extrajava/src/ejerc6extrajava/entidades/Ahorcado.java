/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6extrajava.entidades;

/**
 *
 * @author macbookair
 */
public class Ahorcado {
    private String  palabra;
    private int largo;
    private int maxintento;
    private int encontradas;
    int valor;

    public Ahorcado() {
       encontradas =0;
    }

    public Ahorcado(String palabra, int largo, int maxintento, int encontradas, int valor) {
        this.palabra = palabra;
        this.largo = largo;
        this.maxintento = maxintento;
        this.encontradas = encontradas;
        this.valor = valor;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getMaxintento() {
        return maxintento;
    }

    public void setMaxintento(int maxintento) {
        this.maxintento = maxintento;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", largo=" + largo + ", maxintento=" + maxintento + ", encontradas=" + encontradas + ", valor=" + valor + '}';
    }

    
    
}
