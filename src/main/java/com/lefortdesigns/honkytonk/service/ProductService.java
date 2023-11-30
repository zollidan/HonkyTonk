package com.lefortdesigns.honkytonk.service;

import com.lefortdesigns.honkytonk.models.Product;
import com.lefortdesigns.honkytonk.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> loadAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> loadProductById(long prodId) {
        return productRepository.findById(prodId);
    }

    // public List<Product> loadProductsByArtist(String artistName) {
    // return productRepository.findByArtistName(artistName);
    // }
}
