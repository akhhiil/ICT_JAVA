package com.ukf.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ukf.demo.model.Product;
import com.ukf.demo.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    public ProductRepository repo;

    // Save a product
    public String saveProduct(Product product) {
        repo.save(product);
        return "Product Added";
    }

    // Get all products
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    // Get a product by ID
    public Optional<Product> getProductById(int id) {
        Optional<Product> product = repo.findById(id);
        return product;
    }

    // Delete a product by ID
    public String deleteProductById(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Product Deleted";
        } else {
            return "Product Not Found";
        }
    }

    // Update a product by ID
    public String updateProductById(int id, Product updatedProduct) {
        Optional<Product> productOptional = repo.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            // Update the fields as needed
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setQuantity(updatedProduct.getQuantity());
            // Add other fields if necessary
            repo.save(existingProduct);
            return "Product Updated";
        } else {
            return "Product Not Found";
        }
    }
}
