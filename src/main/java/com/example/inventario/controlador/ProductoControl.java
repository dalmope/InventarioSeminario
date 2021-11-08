package com.example.inventario.controlador;

import com.example.inventario.modelo.Producto;
import com.example.inventario.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("productos")
public class ProductoControl {

    private final ProductoServicio productoServicio;

    @Autowired
    public ProductoControl(ProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
    }

    @PostMapping()
    public void guardar(@RequestBody Producto producto) {
        productoServicio.registrarProducto(producto);
    }

    @GetMapping
    public Iterable<Producto> listarProductos() {
        return productoServicio.listarProductos();
    }

    @GetMapping(path = "/{codigo}")
    public Producto buscarProducto(@PathVariable("codigo") int codigo) {
    return productoServicio.buscarProducto(codigo).get();
    }

    @DeleteMapping (path = "/{codigo}")
    public String eliminarProducto(@PathVariable("codigo") int codigo) {
        Boolean rta = productoServicio.eliminarProducto(codigo);
        if (rta){
            return "Se elimino el producto con codigo: " + codigo;
        }else {
            return "No se pudo eliminar el producto con codigo: " + codigo;
        }
    }

}
