package com.example.inventario.rest;

import com.example.inventario.dao.EmpleadoDAO;
import com.example.inventario.modelo.Empleado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empleados")
public class EmpleadoRest {
    @Autowired
    private EmpleadoDAO empleadoDAO;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Empleado empleado) {empleadoDAO.save(empleado);
    }

}
