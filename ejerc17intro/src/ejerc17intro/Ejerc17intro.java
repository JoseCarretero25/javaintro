/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc17intro;

/**
 *
 * @author macbookair
 */
public class Ejerc17intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector = new int [20];
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        String cadena;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100000);
            System.out.println(vector[i]);
            cadena = Integer.toString(vector[i]);
            
       if (cadena.length() == 1) {
                cont1+= 1;
                
            }
      if (cadena.length() == 2) {
          cont2+= 1;
          
      }
      if (cadena.length() ==3) {
          cont3+= 1;
          
      }
      if (cadena.length() == 4){
          cont4+= 1;
          
      }
      if (cadena.length()== 5) {
          cont5+= 1;
          
      }
    }
        System.out.println("De los numeros del vector hay: "+ "  " + cont1 + " " + "de una cifra " + " " + cont2 + " "  + " de dos cifras" + " " + cont3 + " " + " de tres cifras " + " " + cont4 + " " + "de cuatro cifras y " + " " + cont5 + " " + " de cinco cifras " );    
}
}
