/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena.entidades;

/**
 *
 * @author macbookair
 */
public class Frase {
    private String Palabra;
    private int Long;

    public Frase() {
    }

    public Frase(String Palabra, int Long) {
        this.Palabra = Palabra;
        this.Long = Long;
    }

    public String getPalabra() {
        return Palabra;
    }

    public void setPalabra(String Palabra) {
        this.Palabra = Palabra;
    }

    public int getLong() {
        return Long;
    }

    public void setLong(int Long) {
        this.Long = Long;
    }

    @Override
    public String toString() {
        return "Frase{" + "Palabra=" + Palabra + ", Long=" + Long + '}';
    }
    

   
    
    
}
