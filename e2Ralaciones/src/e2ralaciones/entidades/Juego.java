/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class Juego {
private List <Jugador> jugador;
private Revolver revolver;

    public Juego() {
    }

    public Juego(List<Jugador> jugador, Revolver revolver) {
        this.jugador = jugador;
        this.revolver = revolver;
    }

    public List<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(List<Jugador> jugador) {
        this.jugador = jugador;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugador=" + jugador + ", revolver=" + revolver + '}';
    }

    



    
}
