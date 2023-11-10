package com.reset.ProductService.Controller;

import com.reset.ProductService.Entity.Product;
import com.reset.ProductService.Service.ProductService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/productservice")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/saveproduct")
    public Mono<Product> saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @PostMapping("/savelistofproducts")
    public Mono<List<Product>> createProducts(@RequestBody List<Product> products) {
        return productService.createProducts(products);
    }

    @GetMapping("/getallproducts")
    public Flux<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/getproductbyid/{id}")
    public Mono<Product> getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }
}
