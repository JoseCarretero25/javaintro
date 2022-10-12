/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extraherencia.entidades;

/**
 *
 * @author macbookair
 */
public class Oficinas extends Edificio {
    protected Integer NOficinas;
    protected Integer PersonasporOficina;
    protected Integer Pisos;

    public Oficinas() {
    }

    public Oficinas(Integer NOficinas, Integer PersonasporOficina, Integer Pisos) {
        this.NOficinas = NOficinas;
        this.PersonasporOficina = PersonasporOficina;
        this.Pisos = Pisos;
    }

    public Oficinas(Integer NOficinas, Integer PersonasporOficina, Integer Pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.NOficinas = NOficinas;
        this.PersonasporOficina = PersonasporOficina;
        this.Pisos = Pisos;
    }

    public Integer getNOficinas() {
        return NOficinas;
    }

    public void setNOficinas(Integer NOficinas) {
        this.NOficinas = NOficinas;
    }

    public Integer getPersonasporOficina() {
        return PersonasporOficina;
    }

    public void setPersonasporOficina(Integer PersonasporOficina) {
        this.PersonasporOficina = PersonasporOficina;
    }

    public Integer getPisos() {
        return Pisos;
    }

    public void setPisos(Integer Pisos) {
        this.Pisos = Pisos;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Oficinas{" + "NOficinas=" + NOficinas + ", PersonasporOficina=" + PersonasporOficina + ", Pisos=" + Pisos + ", ancho=" + ancho + ", alto=" + alto + ", largo=" + largo+ '}';
    }
    

    @Override
    public void calcularSuperficie() {
        double area = this.getAlto() * this.getLargo();
        System.out.println("La superficie es de : " + area);
    }

    @Override
    public void calcularVolumen() {
     double volumen = this.getAlto() * this.getLargo() * this.getAncho();
        System.out.println("El volumen es de : " + volumen);   
    }
    
}
