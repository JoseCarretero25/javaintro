/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extrarelaciones.entidades;

/**
 *
 * @author macbookair
 */
public class Alumno {
    private String nombreyapellido;
    private long DNI;
    private Integer votos;

    public Alumno() {
    }

    public Alumno(String nombreyapellido, long DNI, Integer votos) {
        this.nombreyapellido = nombreyapellido;
        this.DNI = DNI;
        this.votos = votos;
    }

    public String getNombreyapellido() {
        return nombreyapellido;
    }

    public void setNombreyapellido(String nombreyapellido) {
        this.nombreyapellido = nombreyapellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public Integer getVotos() {
        return votos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreyapellido=" + nombreyapellido + ", DNI=" + DNI + ", votos=" + votos + '}';
    }

    

    
    
    
}
