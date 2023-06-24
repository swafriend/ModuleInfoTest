package com.example.app;

import com.example.domain.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);

        com.example.domain.Product product = new Product(1L, "sadamu");
        System.out.println(product);
    }

}
