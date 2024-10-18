package com.dana.entity;

import java.util.UUID;

public class ProductEntity {
    private UUID id;          // Identificador único del producto
    private String name;      // Nombre del producto
    private String category;  // Categoría del producto
    private double price;     // Precio del producto
    private int stock;        // Cantidad en stock

    // Constructor
    public ProductEntity(String name, String category, double price, int stock) {
        this.id = UUID.randomUUID(); // Genera un UUID al crear el producto
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    // Getters y Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
