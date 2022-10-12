/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1jpa.persistencia;

import e1jpa.dominio.Libros.Libro;
import java.util.List;

/**
 *
 * @author macbookair
 */
public class LibroDAO extends DAO{
    public Libro guardar(Libro libro) {
        conectar();
        super.guardar(libro);
        return libro;
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

    public List<Libro> listarTodos() throws Exception {
        conectar();
        List<Libro> direcciones = em.createQuery("SELECT d FROM Direccion d")
                .getResultList();
        desconectar();
        return direcciones;
    }
    
}
