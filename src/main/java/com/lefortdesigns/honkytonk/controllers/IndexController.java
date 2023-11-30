package com.lefortdesigns.honkytonk.controllers;

import com.lefortdesigns.honkytonk.models.Product;
import com.lefortdesigns.honkytonk.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class IndexController {

    private final ProductService productService;

    @Autowired
    public IndexController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/message")
    public String message() {
        return "Honky Tonk™ Under reconstrution ";
    }

    @GetMapping("/allProducts")
    public List<Product> allProducts() {
        return productService.loadAllProducts();
    }

    @GetMapping("/product/{prodid}")
    public Optional<Product> findOneProduct(@PathVariable long prodid) {
        return productService.loadProductById(prodid);
    }

    // @GetMapping("/product/{artistName}")
    // public List<Product> findProductsByArtist(@PathVariable String artistName) {
    // return productService.loadProductsByArtist(artistName);
    // }
}
