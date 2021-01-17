package com.javatode.api.service;

import com.javatode.api.model.Product;
import com.javatode.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> readProducts () {
        return productRepository.findAll();
    }

    public void createProducts() {
        productRepository.deleteAll();
        Product product = new Product();
        product.setName("CREMEFRAICHE");
        product.setImageUrl("https://cphapp.rema1000.dk/api/v1/catalog/store/1/item/23420/image/1462221519/600.jpg");

        Product product2 = new Product();
        product2.setName("PEPSI MAX");
        product2.setImageUrl("https://cphapp.rema1000.dk/api/v1/catalog/store/1/item/213942/image/1560262700/600.jpg");

        productRepository.save(product);
        productRepository.save(product2);
    }
}
