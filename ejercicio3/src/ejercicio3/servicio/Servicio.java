/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.servicio;

import ejercicio3.entidades.numerosentidades;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    numerosentidades a = new numerosentidades();
    numerosentidades b = new numerosentidades();
    public numerosentidades ingresenumeros1() {
        System.out.println("Ingrese el primer valor");
        int numero1 = leer.nextInt();
        a.setNumero1(numero1);
        return a;
    }
    public numerosentidades ingresenumeros2() {
        System.out.println("Ingrese el segundo valor");
        int numero2 = leer.nextInt();
        b.setNumero2(numero2);
        return b;
    }
    public void Suma() {
        int suma = a.getNumero1() + b.getNumero2();
        System.out.println("La suma de los numeros es :" + suma);
    }
    public void Resta() {
        int resta = a.getNumero1() - b.getNumero2();
        System.out.println("La resta de los numeros es :" + resta);
    }
    public void Multiplicacion() {
        int multiplicacion = a.getNumero1() * b.getNumero2();
        System.out.println("La multiplicacion de los numeros es :" + multiplicacion);
    }
    public void Division() {
        int division = a.getNumero1() / b.getNumero2();
        System.out.println("La resta de los numeros es :" + division);
    }
    
}
