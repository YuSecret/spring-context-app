package com.geekbrains.spring.context.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Cart cart = context.getBean("cart",Cart.class);
        cart.addProductById(17L);
        cart.addProductById(12L);

        System.out.println(cart.getProductList());

        cart.deleteProductById(17L);

        System.out.println(cart.getProductList());

        context.close();
    }
}
