/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import Principal.dominio.productos.Producto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author macbookair
 */
public final class ProductoDAO extends DAO{
    public void guardarProducto (Producto a) throws Exception {
        try {
            if (a == null) {
                throw new Exception ("Debe ingresar un Producto");
            }
            String sql = "INSERT INTO producto (codigo,nombre,codigo_fabricante) VALUES ('"  + a.getCodigo() + " ',' "  + a.getNombre() +  " ',' " + a.getCodigo_Fabricante() + "');";
            insertarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    }
        public void modificarProductoPorNombre (Producto a) throws Exception {
        try {
            if (a == null) {
                throw new Exception ("Debe ingresar un Producto");
            }
            String sql = "UPDATE producto SET nombre = ' " + a.getNombre()  +  " ' WHERE codigo = " + a.getCodigo() + ";";
            insertarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
        public void eliminarProductoPorNombre (String nombre) throws Exception {
        try {
            
            String sql = "DELETE FROM tienda.producto WHERE nombre = '"
                    + nombre + "'" ;
            insertarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
        public Producto buscarUsuarioPorNombre(String nombre) throws SQLException, ClassNotFoundException, Exception {
        try {
         String sql = "SELECT * FROM tienda.producto" + "WHERE nombre = ' " + nombre + "'";
         
         consultarBase(sql); 
         Producto producto = null;
         while (resultado.next()) {
             producto = new Producto();
             producto.setCodigo(resultado.getInt(1));
             producto.setNombre(resultado.getString(2));
             producto.setPrecio(resultado.getDouble(3));
             producto.setCodigo_Fabricante(resultado.getInt(4));
         }
         desconectarBase();
         return producto;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
        public Collection<Producto> listarUsuarios() throws Exception {
        try {
        String sql = "SELECT * FROM producto"; 
        consultarBase(sql); 
         Producto producto = null;
         Collection <Producto> productos = new ArrayList();
         while (resultado.next()) {
             producto = new Producto();
             producto.setCodigo(resultado.getInt(1));
             producto.setNombre(resultado.getString(2));
             producto.setPrecio(resultado.getDouble(3));
             producto.setCodigo_Fabricante(resultado.getInt(4));
             productos.add(producto);
             
             System.out.println("nombre del producto: " + producto.getNombre().toString()); 
         }
         desconectarBase();
         return productos;
    } catch (Exception e) {
           e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        }  
        
    }
        public Collection<Producto> listarC() throws Exception {
        try {
        String sql = "SELECT * FROM producto WHERE precio >= 120 and precio <=202"; 
        consultarBase(sql); 
         Producto producto = null;
         Collection <Producto> productos = new ArrayList();
         while (resultado.next()) {
             producto = new Producto();
             producto.setCodigo(resultado.getInt(1));
             producto.setNombre(resultado.getString(2));
             producto.setPrecio(resultado.getDouble(3));
             producto.setCodigo_Fabricante(resultado.getInt(4));
             productos.add(producto);
             System.out.println(producto.toString());
         }
         desconectarBase();
         return productos;
    } catch (Exception e) {
           e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        }  
        
    }
        public Collection<Producto> listarD() throws Exception {
        try {
        String sql = "SELECT * FROM producto WHERE nombre like '%portatil%'"; 
        consultarBase(sql); 
         Producto producto = null;
         Collection <Producto> productos = new ArrayList();
         while (resultado.next()) {
             producto = new Producto();
             producto.setCodigo(resultado.getInt(1));
             producto.setNombre(resultado.getString(2));
             producto.setPrecio(resultado.getDouble(3));
             producto.setCodigo_Fabricante(resultado.getInt(4));
             productos.add(producto);
             System.out.println(producto.toString());
         }
         desconectarBase();
         return productos;
    } catch (Exception e) {
           e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        }  
        
    }
        public Collection<Producto> listarE() throws Exception {
        try {
        String sql = "SELECT nombre,precio FROM producto GROUP BY nombre, precio having precio = (SELECT min(precio) from producto)"; 
        consultarBase(sql); 
         Producto producto = null;
         Collection <Producto> productos = new ArrayList();
         while (resultado.next()) {
             producto = new Producto();
             producto.setNombre(resultado.getString(1));
             producto.setPrecio(resultado.getDouble(2));
             productos.add(producto);
             System.out.println(producto.getNombre());
             System.out.println(producto.getPrecio());
         }
         desconectarBase();
         return productos;
    } catch (Exception e) {
           e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        }  
        
    }
}
    
    
    

