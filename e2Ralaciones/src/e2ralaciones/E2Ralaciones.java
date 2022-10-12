/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones;

import e2ralaciones.entidades.Juego;
import e2ralaciones.entidades.Jugador;
import e2ralaciones.entidades.Revolver;
import e2ralaciones.servicio.ServicioJuego;
import e2ralaciones.servicio.ServicioJugador;
import e2ralaciones.servicio.ServicioRevolver;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class E2Ralaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioJuego j1 = new ServicioJuego();
       ServicioJugador a1 = new ServicioJugador();
       ServicioRevolver r1 = new ServicioRevolver();
       Revolver r = r1.llenarRevolver() ;
       List <Jugador> jugador = a1.FabricadeJugadores();
       a1.disparoRevolver();
       a1.ronda();
       j1.CrearJuego(jugador, r);
      
        
       
       
    }
    
}
