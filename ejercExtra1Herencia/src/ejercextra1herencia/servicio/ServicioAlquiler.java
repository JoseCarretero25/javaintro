/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercextra1herencia.servicio;

import ejercextra1herencia.entidades.Alquiler;
import ejercextra1herencia.entidades.BarcoMotor;
import ejercextra1herencia.entidades.Barcos;
import ejercextra1herencia.entidades.Veleros;
import ejercextra1herencia.entidades.Yates;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioAlquiler {

private Scanner leer;
public ServicioAlquiler() {
this.leer  = new Scanner (System.in).useDelimiter("\n");
}
public Alquiler nuevoAlquiler() {
    
    System.out.println("Cual es su nombre?");
    String nombres = leer.next();
    System.out.println("Cual es su DNI?");
    float doc = leer.nextFloat();
    System.out.println("Ingrese el dia de devolucion");
    int dia = leer.nextInt();
    System.out.println("Ingrese el mes de devolucion ");
    int mes = leer.nextInt();
    System.out.println("Ingrese el anio de devolucion");
    int anio = leer.nextInt();
    Date devolucion = new Date(anio-1900,mes-1,dia);
    Date hoy = new Date();
    Integer posicion = (int) (Math.random() * 10);
    return new Alquiler(nombres, doc, hoy, devolucion, posicion);
}   
public void calculoPrecio (Alquiler a, Veleros V,BarcoMotor M, Yates Y) {
  
        Integer moduloV = V.getEnlora() * 10;
        Integer incrementoV = V.getMastiles() + moduloV;
        int diferenciaV = a.getFechadevolcion().getDate() - a.getFechaalquiler().getDate();
        System.out.println(diferenciaV);
        int precioV = diferenciaV * incrementoV;
        System.out.println("El precio a pagar por el velero de matricula :" + V.getMatricula() + "" + " es de : " + precioV  );
        System.out.println(V.toString());
        System.out.println("------------------------------");
        Integer moduloM = M.getEnlora() * 10;
        Integer incrementoM = M.getPotencia() + moduloM;
        int diferenciaM = a.getFechadevolcion().getDate() - a.getFechaalquiler().getDate();
        System.out.println(diferenciaM);
        int precioM = diferenciaM * incrementoM;
        System.out.println("El precio a pagar por el barco a motor de matricula :" + M.getMatricula() + "" + " es de : " + precioM  );
        System.out.println(M.toString());
        System.out.println("------------------------------");
        Integer moduloY = Y.getEnlora() * 10;
        Integer incrementoY = Y.getPotencia() + moduloY;
        int diferenciaY = a.getFechadevolcion().getDate() - a.getFechaalquiler().getDate();
        System.out.println(diferenciaY);
        int precioY = diferenciaY * incrementoY;
         System.out.println("El precio a pagar por el Yate de matricula :" + Y.getMatricula() + "" + " es de : " + precioY  );
         System.out.println(Y.toString());
         System.out.println(a.toString());
       
}
}
