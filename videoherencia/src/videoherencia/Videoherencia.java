/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoherencia;

import java.util.ArrayList;
import videoherencia.entidades.Hotel;
import videoherencia.entidades.Hotel1;
import videoherencia.entidades.Hotel2;
import videoherencia.entidades.Hotel3;
import videoherencia.entidades.Hotel4;
import videoherencia.entidades.Hotel5;

/**
 *
 * @author macbookair
 */
public class Videoherencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Hotel> hoteles = new ArrayList();
       Hotel1 crear1 = new Hotel1(15000d,9d,10);
       Hotel2 crear2 = new Hotel2(20000d,20d,15);
       Hotel3 crear3 = new Hotel3(25000d,25d,20);
       Hotel4 crear4 = new Hotel4(30000d,30d,25);
       Hotel5 crear5 = new Hotel5(35000d,35d,30);
       hoteles.add(crear1);
       hoteles.add(crear2);
       hoteles.add(crear3);
       hoteles.add(crear4);
       hoteles.add(crear5);
        for (Hotel aux : hoteles) {
            if (aux instanceof Hotel5) {
                Hotel5 object = (Hotel5) aux;
                System.out.println( aux + " "+"Soy Hotel 5");
                continue;
                
            }
            if (aux instanceof Hotel4) {
                Hotel4 object = (Hotel4) aux;
                System.out.println( aux + " "+"Soy Hotel 4");
                continue;
                
            }
            if (aux instanceof Hotel3) {
                Hotel3 object = (Hotel3) aux;
                System.out.println( aux + " "+"Soy Hotel 3");
                continue;
                
            } 
            if (aux instanceof Hotel2) {
                Hotel2 object = (Hotel2) aux;
                System.out.println( aux + " "+"Soy Hotel 2");
                continue;
                
            }
            if (aux instanceof Hotel1) {
                Hotel1 object = (Hotel1) aux;
                System.out.println( aux + " "+"Soy Hotel 1");
                continue;
                
            }
            
        }
       
       
       
    }
    
}
