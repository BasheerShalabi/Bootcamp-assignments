package com.example.axsos.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.axsos.models.Category;
import com.example.axsos.models.Product;
import com.example.axsos.repositories.ProductRepository;


@Service
public class ProductService {
	 @Autowired
	 ProductRepository productRepository;

	public List<Product> allProducts() {
        return productRepository.findAll();
	}
	
	
        public Product createProduct(Product product) {
            return productRepository.save(product);
        }


      public Product findProduct(Long id) {
            Optional<Product> optionalProduct = productRepository.findById(id);
            if(optionalProduct.isPresent()) {
                return optionalProduct.get();
            } else {
                return null;
            }
      }
      
      public void addCategory(Category category,Product product) {
    	  product.getCategories().add(category);
    	  productRepository.save(product);
	  }
      
      public List<Product> getProductsByNotContain(Category category){
    	  return productRepository.findByCategoriesNotContains(category);
      }

}
