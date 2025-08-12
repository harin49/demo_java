package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.ProductDTO;

public interface IProductService {
    List<ProductDTO> getAllProducts();
    Optional<ProductDTO> getProductById(Long id);
    ProductDTO saveProduct(ProductDTO productDTO);
    ProductDTO updateProduct(Long id, ProductDTO productDTO);
    void deleteProduct(Long id);
}
