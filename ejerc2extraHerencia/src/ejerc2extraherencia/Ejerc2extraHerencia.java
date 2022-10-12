/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc2extraherencia;

import ejerc2extraherencia.entidades.Edificio;
import ejerc2extraherencia.entidades.Oficinas;
import ejerc2extraherencia.entidades.Polideportivo;
import ejerc2extraherencia.servicio.ServicioOficinas;
import ejerc2extraherencia.servicio.ServicioPoli;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author macbookair
 */
public class Ejerc2extraHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Edificio> lista = new ArrayList();
        ServicioPoli sp = new ServicioPoli();
        ServicioOficinas so = new ServicioOficinas();
        Polideportivo poli1 = sp.crearPoli();
        lista.add(poli1);
        poli1.calcularSuperficie();
        poli1.calcularVolumen();
        Polideportivo poli2 = sp.crearPoli();
        lista.add(poli2);
        poli2.calcularSuperficie();
        poli2.calcularVolumen();
        Oficinas ofi1 = so.crearOficinas();
        lista.add(ofi1);
        ofi1.calcularSuperficie();
        ofi1.calcularVolumen();
        so.cantPersonas(ofi1);
        Oficinas ofi2 = so.crearOficinas();
        lista.add(ofi2);
        ofi2.calcularSuperficie();
        ofi2.calcularVolumen();
        so.cantPersonas(ofi2);
        System.out.println(lista.toString());
        int cont =0;
        if (poli1.isAbierto() == true ){
            cont+=1;
        }
        if (poli2.isAbierto() == true ){
            cont+=1;
        }
        System.out.println("La cantidad de polideportivos abierto es de : " + cont);
        
        
        
        
    }
    
}
