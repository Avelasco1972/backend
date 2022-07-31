
package com.portfolio.mgb.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String institutoC; 
    
    @NotBlank
    private String tituloC;
     @NotBlank
    private String descripcionC;
      @NotBlank
    private String periodoC;
    private String logoC;
    
    //constructor

    public dtoEducacion() {
    }

    public dtoEducacion(String institutoC, String tituloC, String descripcionC, String periodoC, String logoC) {
        this.institutoC = institutoC;
        this.tituloC = tituloC;
        this.descripcionC = descripcionC;
        this.periodoC = periodoC;
        this.logoC = logoC;
    }
    
    //getter and setter

    public String getInstitutoC() {
        return institutoC;
    }

    public void setInstitutoC(String institutoC) {
        this.institutoC = institutoC;
    }

    public String getTituloC() {
        return tituloC;
    }

    public void setTituloC(String tituloC) {
        this.tituloC = tituloC;
    }

    public String getDescripcionC() {
        return descripcionC;
    }

    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }

    public String getPeriodoC() {
        return periodoC;
    }

    public void setPeriodoC(String periodoC) {
        this.periodoC = periodoC;
    }

    public String getLogoC() {
        return logoC;
    }

    public void setLogoC(String logoC) {
        this.logoC = logoC;
    }
    
    
}
