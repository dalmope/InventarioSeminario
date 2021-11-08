package com.example.inventario.controlador;

import com.example.inventario.modelo.Empleado;
import com.example.inventario.servicios.EmpleadoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empleados")
public class EmpleadoControl {

    private final EmpleadoServicio empleadoServicio;

    @Autowired
    public EmpleadoControl (EmpleadoServicio empleadoServicio){
        this.empleadoServicio = empleadoServicio;
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Empleado empleado) {empleadoServicio.registrarEmpleado(empleado);
    }

    @GetMapping
    public Iterable<Empleado> listarEmpleados(){
        return empleadoServicio.listarEmpleados();
    }
    
}
