/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1herencia.entidades;

/**
 *
 * @author macbookair
 */
public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void Alimento() {
        
        System.out.println("El perro come  : " +  " " + this.getAlimento() );
    }
    
    
}
