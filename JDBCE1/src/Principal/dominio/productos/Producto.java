/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.dominio.productos;

import static java.sql.JDBCType.DOUBLE;
import static java.sql.Types.DOUBLE;

/**
 *
 * @author macbookair
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int Codigo_Fabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int Codigo_Fabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.Codigo_Fabricante = Codigo_Fabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigo_Fabricante() {
        return Codigo_Fabricante;
    }

    public void setCodigo_Fabricante(int Codigo_Fabricante) {
        this.Codigo_Fabricante = Codigo_Fabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", Codigo_Fabricante=" + Codigo_Fabricante + '}';
    }

}