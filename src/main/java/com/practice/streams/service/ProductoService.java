package com.practice.streams.service;

import com.practice.streams.dto.ProductoDTO;

import java.util.List;

public interface ProductoService {

    List<ProductoDTO> listarProductos();
    ProductoDTO buscarProductoPorId(Long id);
    ProductoDTO crearProducto(ProductoDTO productoDTO);
    ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO);
    void eliminarProducto(Long id);
}
