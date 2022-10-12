/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.servicio;

import e2ralaciones.entidades.Juego;
import e2ralaciones.entidades.Jugador;
import e2ralaciones.entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioJuego {
private Scanner leer;
public ServicioJuego() {
this.leer  = new Scanner (System.in).useDelimiter("\n"); 
 }
ServicioJugador sj = new ServicioJugador();
ServicioRevolver sr = new ServicioRevolver();
Juego j = new Juego();
public Juego CrearJuego (List <Jugador> jugador,Revolver r2) {
j.setJugador(jugador);
j.setRevolver(r2);
    System.out.println(j);
return j;
}

 
}
   