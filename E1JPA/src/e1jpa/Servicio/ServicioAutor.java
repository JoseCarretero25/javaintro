/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.Servicio;

import e1jpa.dominio.Libros.Autor;
import e1jpa.persistencia.AutorDao;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioAutor {
    private Scanner leer;
    private AutorDao dao;
    Autor A1;
   public ServicioAutor(){ 
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.dao = new AutorDao();
   }
   
    public Autor crearAutor() {
        try {
        A1 = new Autor(Long.MIN_VALUE + 5, "Neruda", true);    
        dao.guardar(A1);
        System.out.println(A1);
        return A1;
       
       
      
    
    
    
} catch (Exception e) {
    throw e;
} 
    }
    
}
