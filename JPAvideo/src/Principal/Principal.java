/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Collection;
import java.util.UUID;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author macbookair
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAvideoPU");
            EntityManager em = emf.createEntityManager();
            try {
               // Fabricante fabricante1 = new Fabricante();
               // fabricante1.setId(UUID.randomUUID().toString());
               // fabricante1.setCodigo(1);
               // fabricante1.setNombre("ASUS");
               // em.getTransaction().begin();
               // em.persist(fabricante1);
               // em.getTransaction().commit();
                
               // Fabricante fabricante2 = new Fabricante();
                //fabricante2.setId(UUID.randomUUID().toString());
                //fabricante2.setCodigo(2);
                //fabricante2.setNombre("SAMSUNG");
               // em.getTransaction().begin();
                //em.persist(fabricante2);
                //em.getTransaction().commit();
                
               // Fabricante fabricante5 = new Fabricante();
               // fabricante2.setId(UUID.randomUUID().toString());
               // fabricante2.setCodigo(4);
               // fabricante2.setNombre("AVH");
              //  em.getTransaction().begin();
               // em.persist(fabricante5);
              //  em.getTransaction().commit();
                
               // Producto producto = new Producto();
                //producto.setId(UUID.randomUUID().toString());
                //producto.setCodigo(100);
                //producto.setNombre("PC Portatil");
                //producto.setPrecio(500);
               // producto.setFabricante(fabricante1);
                //em.getTransaction().begin();
               // em.persist(producto);
               // em.getTransaction().commit();
               Fabricante fabricante7 = new Fabricante();
               fabricante7.setId(UUID.randomUUID().toString());
               fabricante7.setCodigo(4);
               fabricante7.setNombre("AVH");
               em.getTransaction().begin();
               em.persist(fabricante7);
               em.getTransaction().commit();
                
               int codigo=4;
                
               //Fabricante fabricante6 = (Fabricante) em.createQuery("SELECT f" + " FROM Fabricante f "
              //+ "WHERE f.codigo = :codigo").setParameter("codigo", codigo).getSingleResult();
               // System.out.println(fabricante6.toString());
               
              //Fabricante fabricante2c = em.find(Fabricante.class, "6e5dbf7c-f61b-47e2-b234-4fc0d3de4735");
               // System.out.println(fabricante2c.toString());
                
              // Collection <Fabricante> fabricantes = em.createQuery("SELECT f" + " FROM Fabricante f").getResultList();
               // for (Fabricante f : fabricantes) {
               //     System.out.println(f.getCodigo());
                //    System.out.println(f.getNombre());
                    
                //}
                //Producto producto2 = new Producto();
                //producto2.setId(UUID.randomUUID().toString());
                //producto2.setCodigo(500);
               // producto2.setNombre("PC Portatil");
               // producto2.setPrecio(500);
               //producto2.setFabricante(fabricante7);
               // em.getTransaction().begin();
               //em.persist(producto2);
              // em.getTransaction().commit();
              //Producto producto3 = (Producto) em.createQuery("SELECT p" + " FROM Producto p" + " WHERE p.codigo = :codigo").setParameter("codigo", 500).getSingleResult();
                //System.out.println(producto3.toString());     
                //Producto productox = (Producto) em.createQuery("SELECT p" + " FROM Producto p" + " WHERE p.codigo = :codigo").setParameter("codigo", 500).getSingleResult();
                //productox.setCodigo(800);
                //em.getTransaction().begin();
                //em.merge(productox);
                //em.getTransaction().commit();
                      
                Producto producto5 = (Producto) em.createQuery("SELECT p" + " FROM Producto p" + " WHERE p.codigo = :codigo").setParameter("codigo", 800).getSingleResult();
                
                em.getTransaction().begin();
                em.remove(producto5);
                em.getTransaction().commit();
                
                
                
            } catch (Exception e) {
                throw e;
            }
            
            
        } catch (Exception e) {
                throw e;
            }
    }
    
}
