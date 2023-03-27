/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author JhonM
 */
public class Libro {
    
    private String nommbreLibro;
    private double id;
    private String editorial;
    private LocalDate fechaPublicacion;
    private ArrayList<Prestamo> libroPrestado;

    public Libro() {
    }

    public Libro(String nommbreLibro, double id, String editorial, LocalDate fechaPublicacion) {
        this.nommbreLibro = nommbreLibro;
        this.id = id;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.libroPrestado = new ArrayList();
    }

    public String getNommbreLibro() {
        return nommbreLibro;
    }

    public void setNommbreLibro(String nommbreLibro) {
        this.nommbreLibro = nommbreLibro;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public ArrayList<Prestamo> getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(ArrayList<Prestamo> libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    
    
    
}
