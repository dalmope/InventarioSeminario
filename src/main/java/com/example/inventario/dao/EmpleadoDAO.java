package com.example.inventario.dao;

import com.example.inventario.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoDAO extends JpaRepository<Empleado, Integer> {

}
