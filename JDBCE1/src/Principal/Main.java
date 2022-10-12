
package Principal;

import Principal.dominio.productos.ServicioProducto;


public class Main {

    public static void main(String[] args) throws Exception {
        ServicioProducto sp = new ServicioProducto();
        try {
            sp.editarproducto();
            
        } catch (Exception e) {
            throw e;
        }
        
    }
      
    }
    
