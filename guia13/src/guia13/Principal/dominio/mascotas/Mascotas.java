/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13.Principal.dominio.mascotas;

import guia13.Principal.dominio.usuario.Usuario;

/**
 *
 * @author macbookair
 */
public class Mascotas {
    private int id;
    private String apodo;
    private String raza;
    private Usuario usuario;

    public Mascotas() {
    }

    public Mascotas(int id, String apodo, String raza, Usuario usuario) {
        this.id = id;
        this.apodo = apodo;
        this.raza = raza;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mascotas{" + "id=" + id + ", apodo=" + apodo + ", raza=" + raza + ", usuario=" + usuario + '}';
    }
    
    
}
