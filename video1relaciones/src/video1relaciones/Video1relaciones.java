/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1relaciones;

import java.util.ArrayList;
import java.util.List;
import static javafx.scene.input.KeyCode.T;
import video1relaciones.entidades.Mascotas;
import video1relaciones.entidades.Usuarios;
import video1relaciones.enumeraciones.raza;
import video1relaciones.enumeraciones.sexoaminal;
import video1relaciones.servicio.ServicioMascotas;
import video1relaciones.servicio.ServicioUsuario;

/**
 *
 * @author macbookair
 */
public class Video1relaciones {
public static void main(String[] args) {
 Mascotas m1 = new Mascotas("Tango", 3);
 Mascotas m2 = new Mascotas("Flopi", 2);
 ArrayList <Mascotas> mascotas = new ArrayList();
 mascotas.add(m1);
 mascotas.add(m2);
 Usuarios u = new Usuarios();
 u.setNombre("Jose");
 u.setApellido("Carretero");
 u.setDNI(36218507);
 u.setMascotafavorita(m2);
 u.setMascotas(mascotas);
    System.out.println(u.toString());
 
 
    
     
     
   
  
   
    
}
}