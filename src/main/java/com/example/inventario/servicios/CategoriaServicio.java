package com.example.inventario.servicios;

import com.example.inventario.modelo.Categoria;
import com.example.inventario.repositorios.CategoriaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServicio {

    private final CategoriaRepositorio categoriaRepositorio;

    @Autowired
    public CategoriaServicio(CategoriaRepositorio categoriaRepositorio){
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public Categoria registrarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }

}
