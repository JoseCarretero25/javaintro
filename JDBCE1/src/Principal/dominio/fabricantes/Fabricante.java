/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.dominio.fabricantes;

/**
 *
 * @author macbookair
 */
public class Fabricante {
    private Integer Codigo_Fabricante;
    private String nombre;
    public Fabricante() {
    }

    public Fabricante(Integer Codigo_Fabricante, String nombre) {
        this.Codigo_Fabricante = Codigo_Fabricante;
        this.nombre = nombre;
    }

    public Integer getCodigo_Fabricante() {
        return Codigo_Fabricante;
    }

    public void setCodigo_Fabricante(Integer Codigo_Fabricante) {
        this.Codigo_Fabricante = Codigo_Fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante{" + "Codigo_Fabricante=" + Codigo_Fabricante + ", nombre=" + nombre + '}';
    }
    
    
}
