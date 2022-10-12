/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.Principal.persistencia;

import guia13.Principal.dominio.mascotas.Mascotas;
import guia13.Principal.dominio.usuario.Usuario;

/**
 *
 * @author macbookair
 */
public final class MascotasDAO extends DAO {
    private UsuarioDao dao;
    public MascotasDAO() {
        this.dao = new UsuarioDao();
        
    }
    public Mascotas buscarMascotasPorId (int id) throws Exception {
        try{
            String sql = "SELECT * FROM Mascota WHERE id = "+ id +"";
            consultarBase(sql);
            Mascotas mascota = null;
            while(resultado.next()) {
                mascota = new Mascotas();
                mascota.setId(resultado.getInt(1));
                mascota.setApodo(resultado.getString(2));
                mascota.setRaza(resultado.getNString(3));
                Integer idUsuario = resultado.getInt(4);
                Usuario usuario = dao.buscarUsuarioPorCorreo(sql);
                mascota.setUsuario(usuario);   
            }
            desconectarBase();
            return mascota;
            
        }catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
    
}
