package com.example.axsos.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.axsos.models.Category;
import com.example.axsos.models.Product;
import com.example.axsos.repositories.CategoryRepository;


@Service
public class CategoryService {
	 @Autowired
	 CategoryRepository categoryRepository;

	public List<Category> allCategorys() {
        return categoryRepository.findAll();
	}
	
	
	
        public Category createCategory(Category category) {
            return categoryRepository.save(category);
        }


      public Category findCategory(Long id) {
            Optional<Category> optionalCategory = categoryRepository.findById(id);
            if(optionalCategory.isPresent()) {
                return optionalCategory.get();
            } else {
                return null;
            }
      }
      
      public void addProduct(Category category,Product product) {
    	  category.getProducts().add(product);
    	  categoryRepository.save(category);
	    }
      
      public List<Category> getCategoriesByNotContain(Product product){
    	  return categoryRepository.findByProductsNotContains(product);
      }
      
      
     

}
