package com.reset.ProductService.Service;

import com.reset.ProductService.Entity.Product;
import com.reset.ProductService.Repository.ProductRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Mono<Product> saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Mono<List<Product>> createProducts(List<Product> products) {
        return productRepository.saveAll(Flux.fromIterable(products))
                .collectList();
    }

    public Flux<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Mono<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }


}
