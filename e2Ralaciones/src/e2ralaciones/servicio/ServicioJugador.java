/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.servicio;

import e2ralaciones.Pruebaexcepcion;
import e2ralaciones.entidades.Juego;
import e2ralaciones.entidades.Jugador;
import e2ralaciones.entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioJugador extends Pruebaexcepcion{
private ArrayList <Jugador> jugador; 
private Scanner leer;
public ServicioJugador() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
this.jugador = new ArrayList(); 
    }
        
ServicioRevolver r = new ServicioRevolver();
Juego j = new Juego();
public Jugador CrearJugador(){
Random r = new Random();    
double numero = ((double) Math.random() * 10);
int id = r.nextInt(6+1) + 1;
id +=1;
id = leer.nextInt();
System.err.println("Ingrese el nombre del jugador");
String nombre = leer.next();
boolean mojado = false;
int cantidad = 0;
return new Jugador(id,nombre,mojado,cantidad);
 } 
public void crearjugador (Jugador a) throws Pruebaexcepcion {
try {
    if (a.getNombre().isEmpty()) {
        throw new Pruebaexcepcion ("Debe ingresar un nombre");
    }    
} catch (Pruebaexcepcion e) {
    throw e;
} catch (Exception e) {
    System.out.println("Entro al general");
}
}

public List AdherirJugadores(Jugador x) {
 jugador.add(x);
return jugador;
}
public void MostrarJugadores() {
    for (Jugador jugadores : jugador) {
        System.out.println(jugadores.toString());   
    }
}
public List FabricadeJugadores() {
   
int respuesta = 0;    
do {    
System.out.println("Ingrese la cantidad de jugadores");
respuesta = leer.nextInt();

if (respuesta > 6) {
    System.out.println("El numero de jugadores debe ser igual o menor que 6, ingrese nuevamente un valor");
    respuesta = leer.nextInt();
}
}while (respuesta > 6);
if (respuesta <= 6) {
for (int i = 0; i < respuesta ; i++) {
    
Jugador jugadorcreado = CrearJugador();
List <Jugador> jugador = AdherirJugadores(jugadorcreado);
    }
} return jugador;
}

 public boolean disparoRevolver(){    
 boolean disparo = false;
 r.llenarRevolver();
 int cont = 0;
 do {
 cont +=1;    
 r.mojar();
 if (r.mojar() == true) {
 disparo = true;
 } 
 r.siguienteChorro();
 } while (cont <=6);
 return disparo;
} 
 
public void ronda() {

Iterator <Jugador> it = jugador.iterator();
boolean fin = false;
int cont = 0;
do {
 cont +=1;   
 while(it.hasNext()) {
 Jugador w = it.next();
  if (r.mojar() == true) {     
  fin = true;
  System.out.println("El juego ha terminado " + " " + w.getNombre() + " " + "ha resultado mojado");break;   
  } else {
      System.out.println( w.getNombre() + " no ha resultado disparado, pasa al siguiente jugador"); break;   
}
}    

}  while (fin == false && cont < 6); 
    System.out.println("NO HUBO PERDEDORES, INTENTALO DE NUEVO");
}
}