package com.practice.streams.service;

import com.practice.streams.dto.ProductoDTO;
import com.practice.streams.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<ProductoDTO> listarProductos() {
        return List.of();
    }

    @Override
    public ProductoDTO buscarProductoPorId(Long id) {
        return null;
    }

    @Override
    public ProductoDTO crearProducto(ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public ProductoDTO actualizarProducto(Long id, ProductoDTO productoDTO) {
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {

    }
}
