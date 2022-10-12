/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.Principal.dominio.usuario;

import guia13.Principal.persistencia.UsuarioDao;

/**
 *
 * @author macbookair
 */
public class UsuarioServicio {
    private UsuarioDao dao;
    public UsuarioServicio() {
        this.dao = new UsuarioDao();
    }
    public void crearUsuario (String correoElectronico,String clave) throws Exception {
        try {
            if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
                throw new Exception ("Debe indicar correo electronico");
                
            }
            if (clave == null || clave.trim().isEmpty()) {
                throw new Exception ("Debe indicar clave");
            }
            if (dao.buscarUsuarioPorCorreo(correoElectronico) != null) {
               throw new Exception ("Ya existe el usuario"); 
            }
            Usuario usuario = new Usuario();
            usuario.setCorreoElectronico(correoElectronico);
            usuario.setClave(clave);
            dao.guardarUsuario(usuario);
        } catch (Exception e) {
            throw e;
        }
    
    
}
}
