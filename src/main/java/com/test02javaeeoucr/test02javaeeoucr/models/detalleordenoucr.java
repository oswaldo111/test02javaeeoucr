package com.test02javaeeoucr.test02javaeeoucr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class detalleordenoucr {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "orden_id")
    private ordenoucr ordenoucr;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private productooucr productooucr;

    private int cantidadoucr;

    private double preciooucr;

    public detalleordenoucr() {
        super();
    }

    public detalleordenoucr(Long id, com.test02javaeeoucr.test02javaeeoucr.models.ordenoucr ordenoucr,
            com.test02javaeeoucr.test02javaeeoucr.models.productooucr productooucr, int cantidadoucr,
            double preciooucr) {
        this.id = id;
        this.ordenoucr = ordenoucr;
        this.productooucr = productooucr;
        this.cantidadoucr = cantidadoucr;
        this.preciooucr = preciooucr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ordenoucr getOrdenoucr() {
        return ordenoucr;
    }

    public void setOrdenoucr(ordenoucr ordenoucr) {
        this.ordenoucr = ordenoucr;
    }

    public productooucr getProductooucr() {
        return productooucr;
    }

    public void setProductooucr(productooucr productooucr) {
        this.productooucr = productooucr;
    }

    public int getCantidadoucr() {
        return cantidadoucr;
    }

    public void setCantidadoucr(int cantidadoucr) {
        this.cantidadoucr = cantidadoucr;
    }

    public double getPreciooucr() {
        return preciooucr;
    }

    public void setPreciooucr(double preciooucr) {
        this.preciooucr = preciooucr;
    }

    

}
