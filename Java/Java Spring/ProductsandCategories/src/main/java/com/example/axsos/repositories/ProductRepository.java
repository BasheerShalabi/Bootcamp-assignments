package com.example.axsos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.axsos.models.Category;
import com.example.axsos.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	 List<Product> findAll();

	 List<Product> findByCategoriesNotContains(Category category);

}
