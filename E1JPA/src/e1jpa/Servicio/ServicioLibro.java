/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.Servicio;

import e1jpa.dominio.Libros.Autor;
import e1jpa.dominio.Libros.Libro;
import e1jpa.persistencia.AutorDao;
import e1jpa.persistencia.LibroDAO;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioLibro {
     private Scanner leer;
    private LibroDAO dao;
    ServicioAutor sa = new ServicioAutor();
    ServicioEditorial se = new ServicioEditorial();
   public ServicioLibro(){ 
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.dao = new LibroDAO();
   }
    public Libro crearLibro() {
        try {
        Libro A1 = new Libro();
        A1.setId(Long.MIN_VALUE + 3);
        A1.setAnio(2010);
        A1.setAutor(sa.crearAutor());
        A1.setEditorial(se.crearAutor());
        A1.setEjemplares(100);
        A1.setEjemplaresPrestados(50);
        A1.setEjemplaresRestantes(50);
        A1.setTitulo("LO QUE EL VIENTO SE LLEVO");
        A1.setAlta(true);
        
       dao.guardar(A1);
       return A1;
      
    
    
    
} catch (Exception e) {
    throw e;
} 
    }
    
    
}
