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
public class Biblioteca {
    
    private String nombreBiblioteca;
    private ArrayList<Libro> libros;
    private Direccion dirBiblioteca;
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Persona> usuario;

  

    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca, Direccion dirBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = new ArrayList();
        this.dirBiblioteca = dirBiblioteca;
        this.prestamos = new ArrayList();
        this.usuario = new ArrayList();
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Direccion getDirBiblioteca() {
        return dirBiblioteca;
    }

    public void setDirBiblioteca(Direccion dirBiblioteca) {
        this.dirBiblioteca = dirBiblioteca;
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<Persona> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Persona> usuario) {
        this.usuario = usuario;
    }
    
    
    
}
