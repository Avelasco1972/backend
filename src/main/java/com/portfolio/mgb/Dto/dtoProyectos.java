package com.portfolio.mgb.Dto;


import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String logoP;
    
    //constructor

    public dtoProyectos() {
    }

    public dtoProyectos(String nombreP, String descripcionP, String logoP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.logoP = logoP;
    }
    
    //gatter and setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getLogoP() {
        return logoP;
    }

    public void setLogoP(String logoP) {
        this.logoP = logoP;
    }

   
    

}
