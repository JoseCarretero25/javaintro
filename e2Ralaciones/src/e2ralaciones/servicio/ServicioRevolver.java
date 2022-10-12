/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e2ralaciones.servicio;

import e2ralaciones.entidades.Revolver;

/**
 *
 * @author macbookair
 */
public class ServicioRevolver {
Revolver r = new Revolver();    
public Revolver llenarRevolver() {
 double posicionactual = (double) (Math.random()) * 100;
 r.setPosicionactual(posicionactual);
 double posicionagua = (double) (Math.random()) * 100;
 r.setPosicionagua(posicionagua);
 
 return r;
}  
public boolean mojar() {
boolean resultado = false;
double p1 = r.getPosicionactual();
double p2 = r.getPosicionagua();
if (p1==p2) {
    resultado = true;
}
return resultado;
}
public void siguienteChorro() {
double posicionactual = (double) Math.random() * 100;
r.setPosicionactual(posicionactual);
double posicionagua = (double) Math.random() * 100;
r.setPosicionagua(posicionagua);
}

public void tostring() {
    System.out.println("La posicion actual es de " + r.getPosicionactual()); 
    System.out.println("La posicion del agua es de  " + r.getPosicionagua());
}   
}
