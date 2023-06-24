package com.example.domain;

import lombok.Data;

@Data
public class Product {

    public Long id;
    public String name;

    public Product(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
