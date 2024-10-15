package com.ukf.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ukf.demo.model.Product;
import com.ukf.demo.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	public ProductService service;
	
//	@GetMapping("/products")
//	public List<Product> getProducts(){
//		return service.getAllProduct();
//	
//	}
	
//	@PostMapping("/products")
//	public Optional<Product> getProductById(int id){
//		return service.getProductById(id);
//	}
	@GetMapping("/product")
	public ModelAndView listProducts() {
		List<Product> products=service.getAllProducts();
		ModelAndView modelAndView=new ModelAndView("product");
		modelAndView.addObject("products",products);
		return modelAndView;
	}
	@PostMapping("/deleteProduct")
    public ModelAndView deleteProduct(@RequestParam("productId") int id) {
        service.deleteProductById(id);
        return new ModelAndView("redirect:/product");// Redirect to the list of products after deletion
    }
    // Display form for adding a new product
    @GetMapping("/addProduct")
    public ModelAndView addProduct() {
        ModelAndView modelAndView = new ModelAndView("productForm");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }

    // Display form for editing a product
    @GetMapping("/editProduct")
    public ModelAndView editProduct(@RequestParam("productId") int id) {
        System.out.println("Editing product with ID: " + id); // Logging for debugging
        Optional<Product> product = service.getProductById(id);
        ModelAndView modelAndView = new ModelAndView("productForm"); // The form view (JSP/Thymeleaf)
        modelAndView.addObject("product", product.orElse(new Product())); // Adding the product to be edited
        return modelAndView;
    }

    // Save or update a product
    @PostMapping("/saveProduct")
    public ModelAndView saveProduct(@RequestParam(value = "productId", required = false) int id,
            @RequestParam("productName") String name, @RequestParam("productPrice") double price,
            @RequestParam("productQuantity") int quantity) {
        Product product;

        // If productId is provided, fetch the existing product for updating
        if (Integer.valueOf(id) != null && id > 0) {
            Optional<Product> existingProduct = service.getProductById(id);
            product = existingProduct.orElse(new Product());
        } else {
            product = new Product(); // Create a new product if no ID is provided
        }
        product.setName(name);
        product.setPrice(price);
        product.setQuantity(quantity);
        service.saveProduct(product);
        // Redirect after saving or updating
        return new ModelAndView("redirect:/products"); // Redirects to the products list page
    }
//	@PostMapping("/product")
//	public String addProduct(@RequestBody Product product) {
//		return service.saveProduct(product);
//	}
//	@GetMapping("/product/{id}")
//	   public Product getProductById(@PathVariable int id) {
//	       return service.getProductById(id);
//	   }

//	   @DeleteMapping("/product/{id}")
//	   public String deleteProductById(@PathVariable int id) {
//	       return service.deleteProductById(id);
//	   }
//
//	   @PutMapping("/product/{id}")
//	   public String updateProductById(@PathVariable int id, @RequestBody Product product) {
//	       return service.updateProductById(id, product);
//	   }
	   
}
