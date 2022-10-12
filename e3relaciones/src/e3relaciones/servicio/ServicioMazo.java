/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3relaciones.servicio;

import e3relaciones.entidades.Cartas;
import e3relaciones.entidades.Mazo;
import e3relaciones.enumeraciones.Palos;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioMazo {
private Scanner leer;
public ServicioMazo() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
}  
 private Collections x;   
Mazo baraja = new Mazo();
Mazo cartasaliente = new Mazo(); 
 
 public Mazo crearmazo(){ 
    ArrayList <Cartas> cs = new ArrayList();
    ArrayList <Cartas> out = new ArrayList();
    int num = 0;
    cartasaliente.setCartas(out);
    for (Palos aux : Palos.values()) {        
        
    for (int i = 0; i < 10; i++) {
        
     Cartas c = new Cartas(i +1, aux);
     cs.add(c);
    }
    baraja.setCartas(cs);
    }
  
     
    return baraja;
}
public void barajar(){
x.shuffle(baraja.getCartas());
    System.out.println(baraja);
} 
public Cartas SiguienteCarta(){
   Cartas c = baraja.getCartas().get(0);
    System.out.println("La siguiente carta es : " + baraja.getCartas().get(0).toString());
    return c;
} 
public void CartasDisponibles() {
    System.out.println("Las cartas disponibles son : " + baraja.getCartas().size());   
}
public void darCartas() {
System.out.println("Seleccione la cantidad de cartas a recibir: ");
int cant = leer.nextInt();
if (cant <= baraja.getCartas().size()) {
for (int i = 0; i < cant; i++) {
System.out.println("se entrega el " + baraja.getCartas().get(i).toString() + " al jugador");
            }
            for (int i = 0; i < cant; i++) {
                cartasaliente.getCartas().add(baraja.getCartas().get(0));
                baraja.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes. No se entregó ninguna carta al jugador");
            CartasDisponibles();
        }
    }
 public void cartasMonton() {
 System.out.println("Las cartas que ya han salido son : " + cartasaliente.getCartas().toString() );
 if (cartasaliente.getCartas().size() == 0) {
     System.out.println("El maso esta completo");   
 }   
 } 
 public void mostrarBaraja() {
     for (Object aux : baraja.getCartas() ) {
         System.out.println("Las Cartas aun pendientes de salir son : " + aux.toString());
         
     }
   
 }   
}
