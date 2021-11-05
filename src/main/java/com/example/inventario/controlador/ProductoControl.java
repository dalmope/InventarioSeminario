package com.example.inventario.controlador;

import com.example.inventario.modelo.Producto;
import com.example.inventario.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("producto")
public class ProductoControl {

    private final ProductoServicio productoServicio;

    @Autowired
    public ProductoControl (ProductoServicio productoServicio){
        this.productoServicio = productoServicio;
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Producto producto) {productoServicio.registrarProducto(producto);
    }

}
