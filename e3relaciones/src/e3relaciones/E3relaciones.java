/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3relaciones;

import e3relaciones.entidades.Cartas;
import e3relaciones.entidades.Mazo;
import e3relaciones.servicio.ServicioCartas;
import e3relaciones.servicio.ServicioMazo;
import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class E3relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServicioCartas sc = new ServicioCartas();
    ServicioMazo sm = new ServicioMazo();
    Mazo cartas = sm.crearmazo();
    sm.barajar();
    sm.SiguienteCarta();
    sm.CartasDisponibles();
    sm.darCartas();
    sm.cartasMonton();
    sm.mostrarBaraja();
            
    
    
    
    
    
    
    }
    
}
