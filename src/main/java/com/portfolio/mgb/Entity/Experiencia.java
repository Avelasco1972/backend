/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreE;
    private String descripcionE;
    private String anio_ingresoE;
    private String anio_egresoE;
    private String iconoE;
    
    //Constructores

    public Experiencia() {
    }

    public Experiencia(String nombreE, String descripcionE, String anio_ingresoE, String anio_egresoE, String iconoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anio_ingresoE = anio_ingresoE;
        this.anio_egresoE = anio_egresoE;
        this.iconoE = iconoE;
    }

   

   

   
    
    //Getters and setters
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getAnio_ingresoE() {
        return anio_ingresoE;
    }

    public void setAnio_ingresoE(String anio_ingresoE) {
        this.anio_ingresoE = anio_ingresoE;
    }

    public String getAnio_egresoE() {
        return anio_egresoE;
    }

    public void setAnio_egresoE(String anio_egresoE) {
        this.anio_egresoE = anio_egresoE;
    }

    public String getIconoE() {
        return iconoE;
    }

    public void setIconoE(String iconoE) {
        this.iconoE = iconoE;
    }

    
    
}
