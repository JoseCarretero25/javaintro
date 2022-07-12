/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc7peso;

import ejerc7peso.entidades.Personas;
import ejerc7peso.servicio.Servicio;

/**
 *
 * @author macbookair
 */
public class Ejerc7Peso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Servicio ls = new Servicio ();
       Personas a = ls.CrearPersonas();
       Personas b = ls.CrearPersonas();
       Personas c = ls.CrearPersonas();
       Personas d = ls.CrearPersonas();
       
        
       double pesoa = ls.calcularIMC(a);
       double pesob = ls.calcularIMC(b);
       double pesoc = ls.calcularIMC(c);
       double pesod = ls.calcularIMC(d);
       double bolsa1 = 0;
       double bolsa2 = 0;
       double bolsa3 = 0;
        for (int j = 0; j < 4; j++) {
            
        
        for (int i  = 0; i  < 4; i ++) {
            
        
       if (pesoa == -1.0 || pesob == -1.0 || pesoc == -1.0 || pesod == -1.0)  {
           
           
           bolsa1 = bolsa1 + 1;break;
       } 
       else if (pesoa == 0.0 || pesob == 0.0 || pesoc == 0.0 || pesod == 0.0) {
           
           bolsa2 = bolsa2 + 1;break;
       }
       else if (pesoa == 1.0 || pesob == 1.0 || pesoc == 1.0 || pesod == 1.0) {
           bolsa3 +=1; break;
       }
        
        }
        }
        System.out.println(bolsa1 + " " + bolsa2 + " " + bolsa3);
       
       System.out.println(a.toString());
       System.out.println(b.toString());
       System.out.println(c.toString());
       System.out.println(d.toString()); 
        
      
       
      
       
        
    }
    
}
