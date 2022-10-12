/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.Servicio;

import e1jpa.dominio.Libros.Autor;
import e1jpa.dominio.Libros.Editorial;
import e1jpa.persistencia.AutorDao;
import e1jpa.persistencia.EditorialDAO;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioEditorial {
     private Scanner leer;
   private EditorialDAO dao;
   public ServicioEditorial(){ 
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   this.dao = new EditorialDAO();
   }
    public Editorial crearAutor() {
        try {
        Editorial A1 = new Editorial();
        A1.setId(Long.MAX_VALUE + 4);
        A1.setNombre("PACO");
        A1.setAlta(true);
       dao.guardar(A1);
       return A1;
      
    
    
    
} catch (Exception e) {
    throw e;
} 
    }
    
}
