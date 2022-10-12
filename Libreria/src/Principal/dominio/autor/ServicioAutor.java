/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.dominio.autor;

import Principal.persistencia.Autor;
import Principal.persistencia.AutorDAO;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioAutor {
    private Scanner leer;
    private AutorDAO dao;
   public ServicioAutor(){ 
   this.leer  = new Scanner (System.in).useDelimiter("\n");
   }
    public Autor crearAutor() {
        try {
        Autor A1 = new Autor();
        A1.setId(1);
        A1.setNombre("PEPO");
        A1.setAlta(true);
       dao.guardar(A1);
       return A1;
      
    
    
    
} catch (Exception e) {
    throw e;
} 
    }
}