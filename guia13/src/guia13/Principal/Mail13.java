/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.Principal;

import guia13.Principal.dominio.usuario.UsuarioServicio;

/**
 *
 * @author macbookair
 */
public class Mail13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        UsuarioServicio us = new UsuarioServicio();
        try {
            us.crearUsuario("carretero967", "1234");
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
