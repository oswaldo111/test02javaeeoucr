package com.test02javaeeoucr.test02javaeeoucr.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class ordenoucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
      @Temporal(TemporalType.DATE)
     @DateTimeFormat(iso = ISO.DATE)
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
