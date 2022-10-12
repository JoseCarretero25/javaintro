/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.persistencia;

import e1jpa.dominio.Libros.Autor;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class AutorDao extends DAO{
    
    
     
    public Autor guardar(Autor autor) {
        super.guardar(autor);
        return autor;
    }

    public void eliminar(String id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarPorId(String id) throws Exception {
        conectar();
       Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }

    public List<Autor> listarTodos() throws Exception {
        conectar();
        List<Autor> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        desconectar();
        return direcciones;
    }
    
    
}
