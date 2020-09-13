package com.geekbrains.spring.repository;

import com.geekbrains.spring.model.Product;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        this.products = new ArrayList<>();
        this.products.add(new Product(17L, "vilka", 170L));
        this.products.add(new Product(127L, "logka", 385L));
        this.products.add(new Product(20L, "nog", 15L));
        this.products.add(new Product(1L, "pila", 235L));
        this.products.add(new Product(12L, "molotok", 512L));

    }
    public Product findById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        throw new RuntimeException("Product not found");
    }
    public List<Product> findAll() {
        return Collections.unmodifiableList(products);
    }
    public void save(Product box) {

        products.add(box);
    }

    public void deleteById(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }
}
