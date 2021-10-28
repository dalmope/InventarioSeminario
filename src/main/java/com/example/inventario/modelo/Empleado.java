package com.example.inventario.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @Column(unique = true, nullable = false, name="cedula")
    private String cedula;

    @Column(name="nombre")
    private String nombre;

    @Column(name="tipo_doc")
    private String tipoDoc;

    @Column(name="telf")
    private String telf;

    @Column(name="correo",unique = true)
    String correo;

    @Column(name="contrasena")
    String contrasena;

    public Empleado(){}

    public Empleado(String cedula,String nombre,String tipoDoc, String telf,String correo,
                    String contrasena){
        this.cedula=cedula;
        this.nombre=nombre;
        this.tipoDoc=tipoDoc;
        this.telf=telf;
        this.correo=correo;
        this.contrasena=contrasena;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}

