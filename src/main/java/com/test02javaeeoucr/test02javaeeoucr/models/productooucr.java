package com.test02javaeeoucr.test02javaeeoucr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class productooucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreoucr;

    public productooucr() {
    }

    public productooucr(Long id, String nombreoucr) {
        this.id = id;
        this.nombreoucr = nombreoucr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreoucr() {
        return nombreoucr;
    }

    public void setNombreoucr(String nombreoucr) {
        this.nombreoucr = nombreoucr;
    }

    
}
