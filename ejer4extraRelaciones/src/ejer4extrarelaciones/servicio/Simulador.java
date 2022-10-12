/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer4extrarelaciones.servicio;

import ejer4extrarelaciones.comparador.Puestos;
import ejer4extrarelaciones.entidades.Alumno;
import ejer4extrarelaciones.enumeraciones.Apellidos;
import ejer4extrarelaciones.enumeraciones.Nombres;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Simulador {
  private ArrayList <String> nombreyapellido;
  private ArrayList <Long> ndnis;
  private ArrayList <Alumno> alumnos;
  private Scanner leer;
  private HashSet <String> grupovotos;
  public Simulador() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.nombreyapellido = new ArrayList() ;   
   this.ndnis = new ArrayList();
   this.alumnos = new ArrayList();
   this.grupovotos =  new HashSet <String>();
  }
    
    public ArrayList <String> crearNombres() {
        
      int tamanionombres = Nombres.values().length;
      int i = (int) (Math.random() * tamanionombres);  
      Nombres crearnombre =  Nombres.values()[i];
      int tamanioapellidos = Apellidos.values().length;
      int j = (int) (Math.random() * tamanionombres);  
      Apellidos crearapellido = Apellidos.values()[j];
      String suma = crearnombre.toString().concat(crearapellido.toString());
      nombreyapellido.add(suma);
      return nombreyapellido;
    }
    
  
    
    public ArrayList <Long> listadnis(){
        for (int i = 0; i < nombreyapellido.size(); i++) {
      long dniC = (long) (Math.random() * 100000000);
      ndnis.add(dniC);
    }
        return ndnis;
}
    public ArrayList <Alumno> crearAlumno() {
        System.out.println("Cuantos alumnos desea crear");
        int cAlumnos = leer.nextInt();
        for (int i = 0; i < cAlumnos; i++) {
            ArrayList <String> listanom = crearNombres();
            ArrayList <Long> listaDNI = listadnis();
        }
        
        for (int i = 0; i < cAlumnos; i++) {
            String nya = nombreyapellido.get(i).toString();
            long ldni = ndnis.get(i);
            Alumno creado = new Alumno(nya, ldni, 0);
            alumnos.add(creado);
                    }  
        return alumnos;
        }
    public HashSet <String> Votacion(ArrayList <Alumno> a){
        
        
        Iterator <Alumno> it = a.iterator();
        int votos = 0;
        int azar = (int) (Math.random() * a.size());
        grupovotos.add(a.get(azar).getNombreyapellido() + " " + "Votante");        
        while (it.hasNext()) {
         
          Alumno x = it.next();
          
          String w = a.get(azar).getNombreyapellido();
            for (int i = 0; i <a.size(); i++) {
         if (!a.get(i).equals(a.get(azar))) {
         
         grupovotos.add(a.get(i).getNombreyapellido() +" " + "Votado" );
         } 
         if (grupovotos.size() == 4) {
             break;
         }
         
            }
         Iterator <String> correr = grupovotos.iterator();
         while (correr.hasNext()) {
         String nombre = correr.next();
         
         if (nombre.contentEquals(x.getNombreyapellido()+" " + "Votado")) {
             x.setVotos(x.getVotos() + 1);
         }
             }    
        
        
         } System.out.println(grupovotos);
         System.out.println(a);
         grupovotos.removeAll(grupovotos);
         Collections.shuffle(a);
         
         return grupovotos; 
           
        } 
    public void varios () {
        for (int i = 0; i < alumnos.size(); i++) {
     Votacion(alumnos);
     System.out.println("---------------");
    }
    }
    public void Ranking () {
    System.out.println("**********--*********");
    Collections.sort(alumnos,Puestos.ordenardes);
        for (int i = 0; i < 5; i++) {
        System.out.println(alumnos.get(i).getNombreyapellido() +" "+"Esta entre los primeros 5 mas votados con : " + " " +alumnos.get(i).getVotos() + " " + " VOTOS!! Felicidades!! =) ");
            System.out.println("**********--*********");
    }
    
        for (int i = 5; i < 10; i++) {
            
        System.out.println(alumnos.get(i).getNombreyapellido() +" "+"Esta entre los primeros 10 mas votados con: " + " " + alumnos.get(i).getVotos() + " " + " VOTOS!! Felicidades!! =)");
        System.out.println("**********--*********");
    }
        }
}
       
    
   
        
    
