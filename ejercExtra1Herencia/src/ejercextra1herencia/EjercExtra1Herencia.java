/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercextra1herencia;

import ejercextra1herencia.entidades.Alquiler;
import ejercextra1herencia.entidades.BarcoMotor;
import ejercextra1herencia.entidades.Barcos;
import ejercextra1herencia.entidades.Veleros;
import ejercextra1herencia.entidades.Yates;
import ejercextra1herencia.servicio.ServicioAlquiler;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbookair
 */
public class EjercExtra1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioAlquiler sa = new ServicioAlquiler();
       Veleros crearV = new Veleros();
       crearV = crearV.crearBarco();
       BarcoMotor crearM = new BarcoMotor();
       crearM = crearM.crearBarco();
       Yates crearY = new Yates();
       crearY = crearY.crearBarco();
        Alquiler nuevo = sa.nuevoAlquiler();
        sa.calculoPrecio(nuevo,crearV,crearM,crearY);
        
        
    }
    
}
