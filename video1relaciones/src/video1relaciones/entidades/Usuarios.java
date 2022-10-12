/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video1relaciones.entidades;

import java.util.ArrayList;
import video1relaciones.enumeraciones.SexoUsuario;

/**
 *
 * @author macbookair
 */
public class Usuarios {
    private String Nombre;
    private String Apellido;
    private long DNI;
    private SexoUsuario sexo;
    private ArrayList <Mascotas> mascotas;
    private Mascotas mascotafavorita;
    public Usuarios() {
    }

    public Usuarios(String Nombre, String Apellido, long DNI, SexoUsuario sexo, ArrayList<Mascotas> mascotas, Mascotas mascotafavorita) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.sexo = sexo;
        this.mascotas = mascotas;
        this.mascotafavorita = mascotafavorita;
    }

    public Mascotas getMascotafavorita() {
        return mascotafavorita;
    }

    public void setMascotafavorita(Mascotas mascotafavorita) {
        this.mascotafavorita = mascotafavorita;
    }

   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public SexoUsuario getSexo() {
        return sexo;
    }

    public void setSexo(SexoUsuario sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Mascotas> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascotas> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", DNI=" + DNI + ", sexo=" + sexo + ", mascotas=" + mascotas + ", mascotafavorita=" + mascotafavorita + '}';
    }

    
}