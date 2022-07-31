
package com.portfolio.mgb.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String institutoC;
    private String tituloC;
    private String descripcionC;
    private String periodoC;
    private String logoC;
    
    //Constructores

    public Educacion() {
    }

    public Educacion(String institutoC, String tituloC, String descripcionC, String periodoC, String logoC) {
        this.institutoC = institutoC;
        this.tituloC = tituloC;
        this.descripcionC = descripcionC;
        this.periodoC = periodoC;
        this.logoC = logoC;
    }
    
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
