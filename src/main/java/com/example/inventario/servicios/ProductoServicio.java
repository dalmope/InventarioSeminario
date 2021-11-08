package com.example.inventario.servicios;

import com.example.inventario.modelo.Producto;
import com.example.inventario.repositorios.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio {
    private final ProductoRepositorio productoRepositorio;

    @Autowired
    public ProductoServicio(ProductoRepositorio productoRepositorio){ this.productoRepositorio = productoRepositorio;
    }

    public Producto registrarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    public Iterable<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

}

