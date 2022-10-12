/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.Principal.persistencia;

import guia13.Principal.dominio.usuario.Usuario;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;


public final class UsuarioDao extends DAO {
    public void guardarUsuario (Usuario a) throws Exception {
        try {
            if (a == null) {
                throw new Exception ("Debe ingresar un Usuario");
            }
            String sql = "INSERT INTO Usuario (correoElectronico,clave)"
                    + "VALUES ('" + a.getCorreoElectronico() + " ',' " + a.getClave() + "');";
            instarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
    public void modificarUsuario (Usuario a) throws Exception {
        try {
            if (a == null) {
                throw new Exception ("Debe ingresar un Usuario");
            }
            String sql = "UPDATE Usuario SET"
                    + "clave = '" + a.getClave() + " 'WHERE correoElectronico =' " + a.getCorreoElectronico() + "');";
            instarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
    public void eliminarUsuario (String correoElectronico) throws Exception {
        try {
            
            String sql = "DELETE FROM Usuario WHERE correoElectronico = '"
                    + correoElectronico + "'" ;
            instarModificarEliminar (sql);
        } catch (Exception e) {
            throw e;
        }
    
    }
    public Usuario buscarUsuarioPorCorreo(String correoElectronico) throws SQLException, ClassNotFoundException, Exception {
        try {
         String sql = "SELECT * FROM Usuario" + "WHERE correoElectronico = ' " + correoElectronico + "'";
         
         consultarBase(sql); 
         Usuario usuario = null;
         while (resultado.next()) {
             usuario = new Usuario();
             usuario.setId(resultado.getInt(1));
             usuario.setClave(resultado.getString(2));
             usuario.setCorreoElectronico(resultado.getString(3));
         }
         desconectarBase();
         return usuario;

        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public Collection<Usuario> listarUsuarios() throws Exception {
        try {
        String sql = "SELECT correoElectronico, clave FROM Usuario"; 
        consultarBase(sql); 
         Usuario usuario = null;
         Collection <Usuario> usuarios = new ArrayList();
         while (resultado.next()) {
             usuario = new Usuario();
             usuario.setCorreoElectronico(resultado.getString(1));
             usuario.setClave(resultado.getString(2));
             usuarios.add(usuario);     
         }
         desconectarBase();
         return usuarios;
    } catch (Exception e) {
           e.printStackTrace();
            desconectarBase();
            throw  new Exception("Error de sistema");
        }  
        
    }
}
