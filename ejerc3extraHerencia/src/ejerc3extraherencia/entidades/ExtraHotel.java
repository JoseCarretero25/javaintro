/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3extraherencia.entidades;

/**
 *
 * @author macbookair
 */
public class ExtraHotel extends Alojamientos{
    protected boolean privado;
    protected double metros2;

    public ExtraHotel() {
    }

    public ExtraHotel(boolean privado, double metros2) {
        this.privado = privado;
        this.metros2 = metros2;
    }

    public ExtraHotel(boolean privado, double metros2, String nombre, String direccion, String localidad, String nombregerente) {
        super(nombre, direccion, localidad, nombregerente);
        this.privado = privado;
        this.metros2 = metros2;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + (this.privado ? 1 : 0);
        hash = 13 * hash + (int) (Double.doubleToLongBits(this.metros2) ^ (Double.doubleToLongBits(this.metros2) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ExtraHotel other = (ExtraHotel) obj;
        if (this.privado != other.privado) {
            return false;
        }
        if (Double.doubleToLongBits(this.metros2) != Double.doubleToLongBits(other.metros2)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ExtraHotel{" + "nombre=" + nombre + ", direccion=" + direccion + ", localidad=" + localidad + ", nombregerente=" + nombregerente + "privado=" + privado + ", metros2=" + metros2 + '}';
    }
    
    
}
