/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer2herencia.entidades;

import ejer2herencia.enumeraciones.Colores;
import ejer2herencia.enumeraciones.Letras;
import static ejer2herencia.enumeraciones.Letras.A;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Lavadora extends Electrodomestico {
    protected Integer carga;

    public Lavadora() {
    }

    

    public Lavadora(Integer carga, Integer precio, Colores color, Letras letras, Integer peso) {
        super(precio, color, letras, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public Letras getLetras() {
        return letras;
    }

    public void setLetras(Letras letras) {
        this.letras = letras;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

     @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + ", precio=" + precio + ", color=" + color + ", letras=" + letras + ", peso=" + peso+'}';
      
    }
    
    

    

    @Override
    public Lavadora crearElectrodomestico() {   
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Colores colores = Colores.NEGRO;
    int precio = 1000;
    System.out.println("Cual es el color de la Lavadora?");
    String resp = leer.next().toUpperCase();
     if (comprobarColor(resp) == true) {
        colores = Colores.BLANCO;
    }
    if (resp.equals(Colores.AZUL.toString())) {
   colores = Colores.AZUL;
    }
    if (resp.equals(Colores.BLANCO.toString())) {
     colores = Colores.BLANCO;
    }
    if (resp.equals(Colores.GRIS.toString())) {
    colores = Colores.GRIS;
    }
    if (resp.equals(Colores.NEGRO.toString())) {
    colores = Colores.NEGRO;
    }
    if (resp.equals(Colores.ROJO.toString())) {
     colores = Colores.ROJO;
    }
   
    System.out.println("Cual es la letra que representa el consumo energetico?");
    String consumo = leer.next().toUpperCase();
    Letras letras = Letras.A;
    if (ComprobarConsEnergetico(consumo) == true) {
        letras = Letras.F;
    }
    if (consumo.equals(Letras.A.toString()))  {
    letras = Letras.A;
    }
    if (consumo.equals(Letras.B.toString()))  {
    letras = Letras.B;
    }
    if (consumo.equals(Letras.C.toString()))  {
   letras = Letras.C;
    }
    if (consumo.equals(Letras.D.toString()))  {
   letras = Letras.D;
    }
    if (consumo.equals(Letras.F.toString()))  {
    letras = Letras.F;
    }
    System.out.println("Cual es el peso del producto?");
    int pesos =leer.nextInt();
    System.out.println("Cual es la carga?");
    int cargas = leer.nextInt();
    
    
        return new Lavadora(cargas, precio, colores, letras, pesos);
        
    }

   
    @Override
    public void precioFinal() {

        if (this.getLetras().equals(Letras.A)) {
        int precios = this.getPrecio() +1000;
        this.setPrecio(precios); 
    }
    if (this.getLetras().equals(Letras.B)) {
        int precios = this.getPrecio() +800;
        this.setPrecio(precios); 
    }
    if (this.getLetras().equals(Letras.C)) {
        int precios = this.getPrecio() +600;
        this.setPrecio(precios); 
    }
    if (this.getLetras().equals(Letras.D)) {
        int precios = this.getPrecio() +500;
        this.setPrecio(precios);
    }
    if (this.getLetras().equals(Letras.E)) {
        int precios = this.getPrecio() +300;
        this.setPrecio(precios); 
    }
    if (this.getLetras().equals(Letras.F)) {
        int precios = this.getPrecio() +100;
        this.setPrecio(precios); 
    }
   if (this.getPeso() >= 1 && this.getPeso() <=19) {
     int pesos =  this.getPrecio() + 100;
     this.setPrecio(pesos);
   }
   if (this.getPeso() >= 20 && this.getPeso() <=49) {
     int pesos =  this.getPrecio() + 500;
     this.setPrecio(pesos);
   }
   if (this.getPeso() >= 50 && this.getPeso() <=79) {
     int pesos =  this.getPrecio() + 800;
     this.setPrecio(pesos);
   }
   if (this.getPeso() >= 80) {
     int pesos =  this.getPrecio() + 1000;
     this.setPrecio(pesos);
   }
      if(this.getCarga() >=30) {
          int cargado = this.getPrecio() + 500;
          this.setPrecio(cargado);
      }  
    }

   
    @Override
    public boolean ComprobarConsEnergetico(String letra) {
        String ingreso = letra.toUpperCase();
        boolean defecto = false;
        if( (!ingreso.equals(this.letras.A.toString())) || (!ingreso.equals(this.letras.B.toString())) || (!ingreso.equals(this.letras.C.toString()) )|| (!ingreso.equals(this.letras.D.toString() ))|| !ingreso.equals(this.letras.F.toString())) {
             this.setLetras(Letras.F);
             defecto = true;
             
        } 
       return defecto; 
    }

    @Override
    public boolean comprobarColor(String col) {
        boolean defecto = false;
       String colores = col;
       colores.toUpperCase();
        if((!colores.equalsIgnoreCase(Colores.AZUL.toString())) || (!colores.equalsIgnoreCase(Colores.GRIS.toString())) || (!colores.equalsIgnoreCase(Colores.NEGRO.toString()))|| (!colores.equalsIgnoreCase(Colores.ROJO.toString())) || (!colores.equalsIgnoreCase(Colores.BLANCO.toString()))) {
                
                defecto = true;
                
            }
       return defecto;
    }
    
}
