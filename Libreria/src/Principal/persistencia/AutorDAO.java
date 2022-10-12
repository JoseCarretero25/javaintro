/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author macbookair
 */
public class AutorDAO  extends DAO <Autor>{
    
     @Override
    public void guardar(Autor autor) {
        super.guardar(autor);
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

