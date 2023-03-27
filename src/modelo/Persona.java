/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author JhonM
 */
public class Persona {
    
    private String nombrePersona;
    private int edad;
    private long telefono;
    private Direccion dirpersona;
    private ArrayList<Prestamo> prestamos;

    public Persona() {
    }

    public Persona(String nombrePersona, int edad, long telefono, Direccion dirpersona) {
        this.nombrePersona = nombrePersona;
        this.edad = edad;
        this.telefono = telefono;
        this.dirpersona = dirpersona;
        this.prestamos = new ArrayList();
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Direccion getDirpersona() {
        return dirpersona;
    }

    public void setDirpersona(Direccion dirpersona) {
        this.dirpersona = dirpersona;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
}
