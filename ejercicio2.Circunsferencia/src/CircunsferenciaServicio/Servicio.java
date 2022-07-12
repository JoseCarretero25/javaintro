/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunsferenciaServicio;



import entidades.Circunsferencia;
import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Servicio {
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
     Circunsferencia a = new Circunsferencia();
   public Circunsferencia creaCircunsferencia() { 
       System.out.println("Ingrese el radio");
       double radio = leer.nextDouble();
      
       a.setRadio(radio);
       return a;
       
      
           
       }
   public void Area() {
       double area = (Math.PI) * Math.pow (a.getRadio(),2);
       System.out.println("El area es : " + area);
   
        
        
       
       
   }
     public void Perimetro() {
         double perimetro = Math.PI * a.getRadio() * 2;
         System.out.println("El perimetro es : " + perimetro);
       
       
       
   }
    
    
    
   
    
}
    
    

