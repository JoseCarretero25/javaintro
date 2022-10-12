/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.persistencia;

import e1jpa.dominio.Libros.Editorial;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class EditorialDAO extends DAO{
    public Editorial guardar(Editorial editorial) {
        conectar();
        super.guardar(editorial);
        return editorial;
    }

    public void eliminar(String id) throws Exception {
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }

    public Editorial buscarPorId(String id) throws Exception {
        conectar();
       Editorial editorial = em.find(Editorial.class, id);
        desconectar();
        return editorial;
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        desconectar();
        return direcciones;
    }
    
    
    
}
