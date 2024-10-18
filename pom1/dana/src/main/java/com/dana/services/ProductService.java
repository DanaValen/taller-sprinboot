package com.dana.services;
import com.dana.entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {
    private final List<ProductEntity> products;

    // Constructor
    public ProductService() {
        products = new ArrayList<>();
        // Inicializando algunos productos de ejemplo
        products.add(new ProductEntity("Laptop", "Electrónica", 1000.00, 50));
        products.add(new ProductEntity("Silla", "Muebles", 150.00, 30));
        products.add(new ProductEntity("Cámara", "Fotografía", 500.00, 15));
    }

    // Método para crear un nuevo producto
    public ProductEntity createProduct(ProductEntity product) {
        product.setId(UUID.randomUUID()); // Genera un nuevo UUID para el producto
        products.add(product);
        return product;
    }

    // Método para obtener todos los productos
    public List<ProductEntity> getAllProducts() {
        return products;
    }

    // Método para obtener un producto específico por UUID
    public Optional<ProductEntity> getProductById(UUID id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    // Método para actualizar un producto
    public Optional<ProductEntity> updateProduct(UUID id, ProductEntity updatedProduct) {
        return getProductById(id).map(product -> {
            // Actualizando los atributos del producto
            product.setName(updatedProduct.getName());
            product.setCategory(updatedProduct.getCategory());
            product.setPrice(updatedProduct.getPrice());
            product.setStock(updatedProduct.getStock());
            return product; // Retorna el producto actualizado
        });
    }

    // Método para eliminar un producto
    public boolean deleteProduct(UUID id) {
        return products.removeIf(product -> product.getId().equals(id));
    }
}
