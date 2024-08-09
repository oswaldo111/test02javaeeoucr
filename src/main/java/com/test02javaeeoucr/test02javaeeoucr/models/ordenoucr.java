package com.test02javaeeoucr.test02javaeeoucr.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ordenoucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fechaoucr;

    public ordenoucr() {

    }

    public ordenoucr(Long id, LocalDate fechaoucr) {
        this.id = id;
        this.fechaoucr = fechaoucr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFechaoucr() {
        return fechaoucr;
    }

    public void setFechaoucr(LocalDate fechaoucr) {
        this.fechaoucr = fechaoucr;
    }

    
}
