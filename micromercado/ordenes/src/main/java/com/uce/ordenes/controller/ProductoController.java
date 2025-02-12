package com.uce.ordenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uce.ordenes.service.ProductoService;
import com.uce.ordenes.model.Producto;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/buscar")
    public List<Producto> geProductos(){
        return productoService.findAll();
    }
}
