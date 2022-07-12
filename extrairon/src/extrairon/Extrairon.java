/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrairon;

import extrairon.entidades.Escudo;
import extrairon.entidades.Objetos;
import extrairon.servicio.Servicio;
import extrairon.servicio.ServicioObjetos;



/**
 *
 * @author macbookair
 */
public class Extrairon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio ls = new Servicio();
        ServicioObjetos ln = new ServicioObjetos();
        Escudo a = new Escudo();
        ls.RadarVersion10();
        ls.EstadoBateria();
        
        
        
        
       
    }
    
}
