package com.example.inventario.servicios;

import java.util.ArrayList;
import java.util.Optional;

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

    public ArrayList<Empleado> listarEmpleados() {
        return (ArrayList<Empleado>) empleadoRepositorio.findAll();
    }

    public Empleado registrarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public Empleado actualizarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    public Optional<Empleado> buscarEmpleado(Integer id) {
        return empleadoRepositorio.findById(id);
    }

}
