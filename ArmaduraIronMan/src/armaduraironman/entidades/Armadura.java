/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armaduraironman.entidades;

/**
 *
 * @author macbookair
 */
public class Armadura {
    private boolean bota1;
    private boolean bota2;
    private boolean guante1;
    private boolean guante2;
    private float generador;
    private String consola;
    private boolean sintetizador;
    private int resistencia;

    public Armadura() {
        bota1 = true;
        bota2= true;
        guante1= true;
        guante2 = true;
        generador = Float.MAX_VALUE;
        resistencia = 100;
        sintetizador = true;
    }

    public Armadura(boolean bota1, boolean bota2, boolean guante1, boolean guante2, float generador, String consola, boolean sintetizador, int resistencia) {
        this.bota1 = true;
        this.bota2 = true;
        this.guante1 = true;
        this.guante2 = true;
        this.generador = Float.MAX_VALUE;
        this.consola = consola;
        this.sintetizador = true;
        this.resistencia = 100;
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

    public String isConsola() {
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
        return "Armadura{" + "bota1=" + bota1 + ", bota2=" + bota2 + ", guante1=" + guante1 + ", guante2=" + guante2 + ", generador=" + generador + ", consola=" + consola + ", sintetizador=" + sintetizador + ", resistencia=" + resistencia + '}';
    }
    

}