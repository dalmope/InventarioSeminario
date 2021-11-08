package com.example.inventario.controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.inventario.modelo.Empleado;
import com.example.inventario.servicios.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empleados")
public class EmpleadoControl {

    private final EmpleadoServicio empleadoServicio;

    @Autowired
    public EmpleadoControl(EmpleadoServicio empleadoServicio) {
        this.empleadoServicio = empleadoServicio;
    }

    @PostMapping()
    public void guardar(@RequestBody Empleado empleado) {
        empleadoServicio.registrarEmpleado(empleado);
    }

    @GetMapping
    public ArrayList<Empleado> listarEmpleados() {
        return (ArrayList<Empleado>) empleadoServicio.listarEmpleados();
    }

    @GetMapping(path = "/{id}")
    public Optional<Empleado> buscarEmpleado(@PathVariable("id") int id) {
        return empleadoServicio.buscarEmpleado(id);
    }

}
