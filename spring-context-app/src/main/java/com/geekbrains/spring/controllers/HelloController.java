package com.geekbrains.spring.controllers;

import com.geekbrains.spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {
    // context-path: http://localhost:8189/app
    // http://localhost:8189/app/hello
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8189/app/hello_user?name=Bob&surname=Johnson
    @GetMapping("/hello_user")
    @ResponseBody
    public String sayHello(@RequestParam(name = "name", defaultValue = "Unknown") String username, @RequestParam(defaultValue = "Unknown") String surname) {
        return String.format("Hello, %s %s!!!", username, surname);
    }
}
