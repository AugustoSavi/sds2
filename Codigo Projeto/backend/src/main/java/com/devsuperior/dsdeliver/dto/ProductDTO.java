package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.Product;

import java.io.Serializable;

public class ProductDTO implements Serializable {
    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;

    public ProductDTO(){

    }

    public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUri = imageUri;
    }

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.description = product.getDescription();
        this.imageUri = product.getImageUri();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImageUri() {
        return imageUri;
    }
}
