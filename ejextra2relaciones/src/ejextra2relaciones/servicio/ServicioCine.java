/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones.servicio;

import ejextra2relaciones.entidades.Cine;
import ejextra2relaciones.entidades.Espectador;
import ejextra2relaciones.entidades.Sala;
import ejextra2relaciones.enumeraciones.LetrasSalas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioCine {
ArrayList <Sala> asientos; 
ServicioEspectador se = new ServicioEspectador();
private Scanner leer;
public ServicioCine() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
this.asientos = new ArrayList();
}  
Cine comercio = new Cine();
public Cine CrearSalas(){
 
    for (LetrasSalas sala : LetrasSalas.values()) {
        for (int i = 0; i < 8; i++) {
            Sala crear = new Sala (i + 1,sala,"L");
            asientos.add(crear);
            
        }
        comercio.setSala(asientos);
       
    }
    
    
return comercio;
}  
public void MostrarSalaA(){
    Iterator <Sala> it = asientos.iterator() ;
    while (it.hasNext()) {
         Sala x = it.next();
   switch (x.getLetrasala()){
       case A :
           System.out.print(x.getNumerodeasiento() + " " + x.getLetrasala() + " " + x.getOcupado() + "|" );
           break;  }};
    
}
public void MostrarSalaB () {
Iterator <Sala> b = asientos.iterator();

    while (b.hasNext()) {
         Sala J = b.next();     
   switch (J.getLetrasala()){
       case B : 
           System.out.print(J.getNumerodeasiento() + " " + J.getLetrasala() + " " + J.getOcupado() + "|"); break;
       
    }
}
}
public void MostrarSalaC () {
Iterator <Sala> b = asientos.iterator();

    while (b.hasNext()) {
         Sala J = b.next();     
   switch (J.getLetrasala()){
       case C: 
           System.out.print(J.getNumerodeasiento() + " " + J.getLetrasala() + " " + J.getOcupado() + "|" ); break;
       
    }
}
}
public void MostrarSalaD () {
Iterator <Sala> b = asientos.iterator();

    while (b.hasNext()) {
         Sala J = b.next();     
   switch (J.getLetrasala()){
       case D : 
           System.out.print(J.getNumerodeasiento() + " " + J.getLetrasala() + " " + J.getOcupado() +"|" ); break;
       
    }
}
}
public void MostrarSalaE () {
Iterator <Sala> b = asientos.iterator();

    while (b.hasNext()) {
         Sala J = b.next();     
   switch (J.getLetrasala()){
       case E : 
           System.out.print(J.getNumerodeasiento() + " " + J.getLetrasala() + " " + J.getOcupado() + "|" ); break;
       
    }
}
}
public void MostrarSalaF () {
Iterator <Sala> b = asientos.iterator();

    while (b.hasNext()) {
         Sala J = b.next();     
   switch (J.getLetrasala()){
       case F : 
           System.out.print(J.getNumerodeasiento() + " " + J.getLetrasala() + " " + J.getOcupado() + "|" ); break;
       
    }
}
}
public void SalaCompleta() {
    MostrarSalaA();
    System.out.println("");
    MostrarSalaB();
    System.out.println("");
    MostrarSalaC();
    System.out.println("");
    MostrarSalaD();
    System.out.println("");
    MostrarSalaE();
    System.out.println("");
    MostrarSalaF();
}

public void Simulacion() {

ArrayList <Espectador> publico = se.Fabricadepublico();
int cantidadcreada = publico.size();
System.out.println("La cantidad de compradores es: " + " " + cantidadcreada);
int cont = 0;
Iterator <Espectador> cliente = publico.iterator();
while (cliente.hasNext()) {
         Espectador w = cliente.next();
         char nombre = w.getNombre();
         int edad = w.getEdad();
         int dinerod= w.getDinerodisponible();
char letralugar = (char) (Math.random() * 6 + 'A');
int numerolugar = (int) (Math.random() * 8);    
Iterator <Sala> ubicar = asientos.iterator();
while (ubicar.hasNext()) {
 
         Sala x = ubicar.next();
       
       if (edad>=18 || dinerod >150)  {    
       if (x.getNumerodeasiento()== numerolugar && x.getLetrasala().toString().equalsIgnoreCase(Character.toString(letralugar)) && x.getOcupado().equalsIgnoreCase("L")) {
           x.setOcupado("X");
           System.out.println("El comprador : " + "" + nombre  + " " + "se ha ubicado en el asiento : " + " " + x.getNumerodeasiento() + " " + x.getLetrasala()); break; 
           } 
          
           } 
          else {
          
           System.out.println("El cliente : " + " " + nombre + " " + "es menor de 18 anios y/o no cuenta con dinero suficiente"); break;
       }
}
         

}
}
}

