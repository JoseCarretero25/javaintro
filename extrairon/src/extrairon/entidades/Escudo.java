/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrairon.entidades;

/**
 *
 * @author macbookair
 */
public class Escudo {
    private boolean bota1;
    private boolean bota2;
    private boolean guante1;
    private boolean guante2;
    private float generador;
    private String consola;
    private boolean sintetizador;
    private int resistencia;
    private  double [] distancia; 
    private double [] enemigo; 

    public Escudo() {
     bota1 = true;
     bota2= true;
     guante1= true;
     guante2 = true;
     generador = 1000000;
     resistencia = 100;
     sintetizador = true;
    }

    public Escudo(boolean bota1, boolean bota2, boolean guante1, boolean guante2, float generador, String consola, boolean sintetizador, int resistencia, double enemigo) {
      this.bota1 = true;
        this.bota2 = true;
        this.guante1 = true;
        this.guante2 = true;
        this.generador = 1000000;
        this.consola = consola;
        this.sintetizador = true;
        this.resistencia = 100;
      
    }

    public double [] getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(double [] enemigo) {
        this.enemigo = enemigo;
    }
    
    public double [] getDistancia() {
        return distancia;
    }

    public void  setDistancia(double [] distancia) {
        this.distancia = distancia;
    }

    public boolean isBota1() {
        return bota1;
    }

    public void setBota1(boolean bota1) {
        this.bota1 = bota1;
    }

    public boolean isBota2() {
        return bota2;
    }

    public void setBota2(boolean bota2) {
        this.bota2 = bota2;
    }

    public boolean isGuante1() {
        return guante1;
    }

    public void setGuante1(boolean guante1) {
        this.guante1 = guante1;
    }

    public boolean isGuante2() {
        return guante2;
    }

    public void setGuante2(boolean guante2) {
        this.guante2 = guante2;
    }

    public float getGenerador() {
        return generador;
    }

    public void setGenerador(float generador) {
        this.generador = generador;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public boolean isSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(boolean sintetizador) {
        this.sintetizador = sintetizador;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    @Override
    public String toString() {
        return "Escudo{" + "bota1=" + bota1 + ", bota2=" + bota2 + ", guante1=" + guante1 + ", guante2=" + guante2 + ", generador=" + generador + ", consola=" + consola + ", sintetizador=" + sintetizador + ", resistencia=" + resistencia + ", distancia=" + distancia + '}';
    }

   
    
    
    
}
