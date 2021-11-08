package com.example.inventario.servicios;

import java.util.Optional;

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

    public Optional<Producto> buscarProducto(Integer id) {
        return productoRepositorio.findById(id);
    }

    public Boolean eliminarProducto(Integer id) {
        Optional<Producto> producto = productoRepositorio.findById(id);
        if (producto.isPresent()) {
            productoRepositorio.deleteById(id);
            return true;
        }
        return false;
    }

    public Producto actualizarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

}

