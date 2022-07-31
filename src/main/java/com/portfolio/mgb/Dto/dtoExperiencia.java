/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
     @NotBlank
    private String anio_ingresoE;
      @NotBlank
    private String anio_egresoE;
    private String iconoE;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String anio_ingresoE, String anio_egresoE, String iconoE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.anio_ingresoE = anio_ingresoE;
        this.anio_egresoE = anio_egresoE;
        this.iconoE = iconoE;
    }

   
   
    //Getters & Setters

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
