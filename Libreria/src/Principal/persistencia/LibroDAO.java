/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal.persistencia;

import Principal.dominio.editorial.Editorial;
import Principal.dominio.libro.Libro;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class LibroDAO extends DAO <Libro> {
    @Override
    public void guardar(Libro libro) {
        super.guardar(libro);
    }

    public void eliminar(String id) throws Exception {
       Libro libro  = buscarPorId(id);
        super.eliminar(libro);
    }

    public Libro buscarPorId(String id) throws Exception {
        conectar();
       Libro libro = em.find(Libro.class, id);
        desconectar();
        return libro;
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        desconectar();
        return direcciones;
    }
    
    
    
    
}
