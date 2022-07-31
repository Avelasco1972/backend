
package com.portfolio.mgb.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String logoP;
    
    //Constructores

    public Proyectos() {
    }

    public Proyectos(String nombreP, String descripcionP, String logoP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.logoP = logoP;
    }
    
    //getter and setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
