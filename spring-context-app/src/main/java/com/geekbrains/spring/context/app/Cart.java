package com.geekbrains.spring.context.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Cart {
    private List<Product> productList;
    private ProductRepository productRepository;
    @Autowired
    public Cart(List<Product> productList, ProductRepository productRepository) {
        this.productList = productList;
        this.productRepository = productRepository;
    }
    public List<Product> getProductList() {
        return this.productList;
    }
    public void addProductById(Long id) {
        this.productList.add(productRepository.findById(id));
    }
    public void deleteProductById(Long id) {
        this.productList.remove(productRepository.findById(id));
    }
}
