/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc6poo2.servicio;

import ejerc6poo2.entidades.Productos;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
 private HashMap <String ,Integer> producto ;
 private Scanner leer; 
  public Servicio() {
     this.leer  = new Scanner (System.in).useDelimiter("\n");
     this.producto = new HashMap() ;
    }
  public Productos CrearProducto(){
      System.out.println("Ingrese un producto");
      String cosa = leer.next();
      System.out.println("Ingrese el precio del producto");
      int precio = leer.nextInt();
      return new Productos (cosa,precio);
  }
 public void llenarMapa (Productos a) {  
     producto.put (a.getProducto(),a.getPrecio());
 }
 public void MostrarMapa () {
     for (Map.Entry<String, Integer> entry : producto.entrySet()) {
         String key = entry.getKey();
         Integer value = entry.getValue();
         System.out.println("Producto : " + " " + key + " " + "Precio : "  + value);
     }
 }
 public void FabricadeProductos(int cantidad) {
     for (int i = 0; i < cantidad; i++) {
     Productos productocreado = CrearProducto ();
     llenarMapa (productocreado);
     System.out.println("Desea agregar otro producto?");
     String consulta = leer.next();
     if (consulta.equalsIgnoreCase("no")) {
            break;
      }
         
     }
 }
 public void RemoverProducto (int cantidad) {
  System.out.println("Ingrese un producto a eliminar");
  String eliminar = leer.next();   
 for (Map.Entry<String, Integer> entry : producto.entrySet()) {
  
         String key = entry.getKey();
         Integer value = entry.getValue();       
  
  if (key.equalsIgnoreCase(eliminar)){
      producto.remove(key); break;
}
 }   
 }
 public void CambiarPrecio (int cantidad) {
  System.out.println("Ingrese el producto y el precio a actualizar");
  String prod = leer.next();
  Integer cambiar = leer.nextInt(); 
    
 for (Map.Entry<String, Integer> entry : producto.entrySet()) {
         String key = entry.getKey();
         Integer value = entry.getValue();       
  
  if (key.equalsIgnoreCase(prod)){
      producto.replace(prod, cambiar) ; break;
}
 }
 }
 public void Menu(Productos a) {
     String opcion = "";
     String respuesta = "";
     do {
     System.out.println("Menu: Intruducir el numero de la opcion deseada");
     System.out.println("1 : Introducir un elemento");
     System.out.println("2 : Modificar precio");
     System.out.println("3 : Eliminar Producto");
     System.out.println("4 : Mostrar Productos");
     System.out.println("5 : Salir");
     opcion = leer.next();
     switch (opcion) {
         case "1" :
             FabricadeProductos(100);break;
         case "2" :
             CambiarPrecio(100);break;
         case "3":
             RemoverProducto(100);break;
         case "4" :
             MostrarMapa();break;
         case "5" :
             System.out.println("Esta seguro que desea salir?");
             respuesta = leer.next();break;
     }
    
     } while (!respuesta.equalsIgnoreCase("si")); 
 }


}
