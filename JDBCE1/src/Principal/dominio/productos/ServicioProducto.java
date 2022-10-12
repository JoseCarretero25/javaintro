/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.dominio.productos;

import Principal.persistencia.ProductoDAO;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ServicioProducto {
    private ProductoDAO dao;
    private Scanner leer;
    public ServicioProducto() {
        this.dao = new ProductoDAO();
        this.leer  = new Scanner (System.in).useDelimiter("\n");
    }
     public void crearProducto () throws Exception {
        try {
            
            Producto producto = new Producto();
            int codigo = leer.nextInt();
            producto.setCodigo(codigo);
            String nombre = leer.next();
            producto.setNombre(nombre);
            Double precio = leer.nextDouble();
            producto.setPrecio(precio);
            int codigo_fabricante = leer.nextInt();
            producto.setCodigo_Fabricante(codigo_fabricante);
            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    
    
}
      public void listarPorNombre () throws Exception {
        try {
            
            
            dao.listarE();

        } catch (Exception e) {
            throw e;
        }
    
    
}
      public void editarproducto() throws Exception {
         Producto x =  new Producto();
         System.out.println( "el nombre modificado y el codigo de prodructo a modificar");
         String nombre = leer.next();
         x.setNombre(nombre);
         int codigo = leer.nextInt();
         x.setCodigo(codigo);
         
         
         dao.modificarProductoPorNombre(x);
      }
    
}
