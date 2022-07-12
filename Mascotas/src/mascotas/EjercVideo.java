/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotas;

import mascotas.Servicio.Servicio;
import mascotas.entidades.Mascotas;

/**
 *
 * @author macbookair
 */
public class EjercVideo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Servicio ls = new Servicio ();
     ls.FabricadeMascotas(2);
     ls.MostrarMascotas();
     ls.ActualizarMascota("tango","caruzo");
     ls.MostrarMascotas();
     
    
  
   
     
     
    }
    
}
