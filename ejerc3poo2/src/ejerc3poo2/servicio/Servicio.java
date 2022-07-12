/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc3poo2.servicio;

import ejerc3poo2.entidades.Alumnos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
  private ArrayList <Alumnos> alumnos;
  private Scanner leer;
  
  
  public Servicio() {
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.alumnos = new ArrayList() ;   
  }
  public Alumnos CrearAlumnos () {
      ArrayList <Integer> notas = new ArrayList();
      System.out.println("Ingrese el nombre del alumno");
      String nombre = leer.next();
      System.out.println("Ingrese la nota 1, 2 y 3 respectivamente");
      int nota1 = leer.nextInt();
      int nota2 = leer.nextInt();
      int nota3 = leer.nextInt();
      int notafinal = (nota1 + nota2 + nota3) / 3;
      notas.add(notafinal);
     return new Alumnos (nombre,notas); 
  }
  public void AdherirAlumnos (Alumnos a) {
      alumnos.add(a);
  }
  public void MostrarAlumnos (){
      for (Alumnos creado : alumnos) {
          System.out.println(creado.toString());
      }
  }
  public void FabricadeAlumnos (int cantidad) {
      for (int i = 0; i < cantidad; i++) {
          Alumnos Alumnoscreado = CrearAlumnos();
          AdherirAlumnos(Alumnoscreado);
          System.out.println("Desea agregar otro alumno?");
       String consulta = leer.next();
       if (consulta.equalsIgnoreCase("no")) {
            break;
      }
  }
}
public void Iterador (){
 Iterator <Alumnos> it = alumnos.iterator();
 System.out.println("Ingrese el nombre del alumno a calcular su nota final");
 String ingreso = leer.next();
 double notafinal= 0;
 while(it.hasNext()) {
 Alumnos x = it.next();
  if (x.getNombre().equalsIgnoreCase(ingreso)) {
  System.out.println("La nota final del alumnos : " + x.getNombre() + " " + "es igual a : " + x.getNotas());   
  } 
}
}
}