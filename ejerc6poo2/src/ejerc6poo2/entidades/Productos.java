/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6poo2.entidades;

/**
 *
 * @author macbookair
 */
public class Productos {
    private String Producto;
    private Integer Precio;

    public Productos() {
    }

    public Productos(String Producto, int Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "Producto=" + Producto + ", Precio=" + Precio + '}';
    }
    
    
}
