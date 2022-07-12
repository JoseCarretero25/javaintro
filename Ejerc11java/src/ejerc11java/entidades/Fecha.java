/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc11java.entidades;

import java.util.Date;

/**
 *
 * @author macbookair
 */
public class Fecha {
    private Date diaterminado;

    public Fecha() {
    }

    public Fecha(Date diaterminado) {
        this.diaterminado = diaterminado;
    }

    public Date getDiaterminado() {
        return diaterminado;
    }

    public void setDiaterminado(Date diaterminado) {
        this.diaterminado = diaterminado;
    }

    @Override
    public String toString() {
        return "Fecha{" + "diaterminado=" + diaterminado + '}';
    }
    
    
}
