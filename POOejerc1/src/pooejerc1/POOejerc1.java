/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerc1;

import java.util.Scanner;
import pooejerc1.entidades.Personas;
import pooejerc1.service.serviciopersona;

/**
 *
 * @author macbookair
 */
public class POOejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in).useDelimiter("/n");   
     Personas p1 = new Personas("Jose Alberto Carretero" ,"36218507", "Av. Alberdi 1675", 30);
        
     
     p1.setNombre("Caren Carretero");
     
     
     p1.pasear(100);
     System.out.println(p1);
     serviciopersona sp = new serviciopersona();
     
     Personas p2 = sp.crearPersona();
     System.out.println(p2.toString());
             
    }
    
    
}
