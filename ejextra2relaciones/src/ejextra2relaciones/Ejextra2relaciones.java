/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejextra2relaciones;

import ejextra2relaciones.servicio.ServicioCine;
import ejextra2relaciones.servicio.ServicioEspectador;

/**
 *
 * @author macbookair
 */
public class Ejextra2relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioCine sc = new ServicioCine();
      ServicioEspectador se = new ServicioEspectador();
      sc.CrearSalas();
      sc.SalaCompleta();
      System.out.println("");
      sc.Simulacion();
      sc.SalaCompleta();
    }
    
}
