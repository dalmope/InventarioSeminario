package com.example.inventario.servicios;

import com.example.inventario.modelo.Empleado;
import com.example.inventario.repositorios.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServicio {
    private final EmpleadoRepositorio empleadoRepositorio;

    @Autowired
    public EmpleadoServicio(EmpleadoRepositorio empleadoRepositorio){
        this.empleadoRepositorio = empleadoRepositorio;
    }

    public Empleado registrarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

}
