/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1herencia;

import e1herencia.entidades.Animal;
import e1herencia.entidades.Caballo;
import e1herencia.entidades.Gato;
import e1herencia.entidades.Perro;

/**
 *
 * @author macbookair
 */
public class E1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Caca", 15, "Doberman");
        perro1.Alimento();
        Animal gato1 = new Gato ("Teddy","Croquetas",10, "Chihuehua");
        gato1.Alimento();
        Animal caballo1 = new Caballo("Spart","Pasto", 25, "fino");
        caballo1.Alimento();
        
    }
    
    
}
