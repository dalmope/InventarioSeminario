package com.example.inventario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name="Categoria")
public class Categoria {
    @Id
    @Column(name="codigo")
    Integer codigo;

    @Column(name="nombre")
    String nombre;

    public Categoria(){}

    public Categoria(Integer codigo, String nombre){
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public Categoria(String nombre){
        this.nombre=nombre;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
