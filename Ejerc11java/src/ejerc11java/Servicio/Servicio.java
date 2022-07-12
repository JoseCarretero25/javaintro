/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc11java.Servicio;

import ejerc11java.entidades.Fecha;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Fecha  a = new Fecha();
    public Fecha cargarFecha() {
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese anio");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900,mes-1,dia);
        a.setDiaterminado(fecha);
        
        return a;
    }
    public void comparacionFecha() {
        Date hoy = new Date();
        int diferencia = hoy.getYear() - a.getDiaterminado().getYear();
        
        System.out.println(diferencia);
    }
}
