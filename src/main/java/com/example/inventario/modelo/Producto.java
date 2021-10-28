package com.example.inventario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto {
    @Id
    @Column(name="codigo")
    String codigo;

    @Column(name="nombre")
    String nombre;

    @Column(name="precio")
    double precio;

    @Column(name="cantidad")
    int cantidad;

    @Column(name="iva")
    double iva;

    @Column(name="retencion")
    double retencion;

    @Column(name="stock")
    int stock;

    @Column(name="categoria")
    Integer categoria;

    public Producto(){}

    public Producto(String codigo,String nombre,double precio,int cantidad,double iva,
                    double retencion,int stock,Integer categoria){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.cantidad=cantidad;
        this.iva=iva;
        this.retencion=retencion;
        this.stock=stock;
        this.categoria=categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getRetencion() {
        return retencion;
    }

    public void setRetencion(double retencion) {
        this.retencion = retencion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }
}
