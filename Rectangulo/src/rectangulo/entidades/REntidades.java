/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangulo.entidades;

/**
 *
 * @author macbookair
 */
public class REntidades {
    private int base;
    private int altura;

    public REntidades() {
    }

    public REntidades(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "REntidades{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
