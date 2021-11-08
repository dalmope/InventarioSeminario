package com.example.inventario.controlador;

import java.util.ArrayList;

import com.example.inventario.modelo.Categoria;
import com.example.inventario.servicios.CategoriaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("categorias")
public class CategoriaControl {

    private final CategoriaServicio categoriaServicio;

    @Autowired
    public CategoriaControl (CategoriaServicio categoriaServicio){
        this.categoriaServicio = categoriaServicio;
    }

    @PostMapping
    public Categoria registrarCategoria(@RequestBody Categoria categoria){
        return categoriaServicio.registrarCategoria(categoria);
    }

    @GetMapping
    public ArrayList<Categoria> listarCategorias(){
        return categoriaServicio.listarCategorias();
    }
    
}
