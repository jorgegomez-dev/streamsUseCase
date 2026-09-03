package com.practice.streams.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private BigDecimal precio;
    private Integer stock;
    private boolean activo;

    public Producto() {
    }

    public Producto(Long id, String nombre, BigDecimal precio, Integer stock, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.activo = activo;
    }

    public Long getId() {
        return id;
    }

    public Producto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public Producto setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public Producto setPrecio(BigDecimal precio) {
        this.precio = precio;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public Producto setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public boolean isActivo() {
        return activo;
    }

    public Producto setActivo(boolean activo) {
        this.activo = activo;
        return this;
    }
}
