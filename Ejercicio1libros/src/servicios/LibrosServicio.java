/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import ejercicio1libros.entidades.libros;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class LibrosServicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public libros altalibros()  {
    
    libros l1 = new libros ();
        System.out.println("Ingrese ISBN");
        l1.setISBN(leer.nextLine());
        System.out.println("Ingrese Titulo");
        l1.setTitulo(leer.nextLine());
        System.out.println("Ingrese Autor");
        l1.setAutor(leer.nextLine());
        System.out.println("Ingrese Numero de Paginas");
        l1.setNumeroPaginas(leer.nextInt());
        
        return  l1;
        
        
    
}
}
