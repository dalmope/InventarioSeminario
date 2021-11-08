package com.example.inventario.servicios;

import java.util.ArrayList;
import java.util.Optional;

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

    public Optional<Categoria> obtenerCategoria(Integer id) {
        return categoriaRepositorio.findById(id);
    }

    public ArrayList<Categoria> listarCategorias() {
        return (ArrayList<Categoria>) categoriaRepositorio.findAll();
    }

    public void eliminarCategoria(Integer id) {
        categoriaRepositorio.deleteById(id);
    }

    public Categoria actualizarCategoria(Categoria categoria) {
        return categoriaRepositorio.save(categoria);
    }
}
