package com.example.axsos.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.axsos.models.Category;
import com.example.axsos.models.Product;
import com.example.axsos.services.CategoryService;
import com.example.axsos.services.ProductService;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;


import jakarta.validation.Valid;

@Controller
public class ProductCategoryController {	

	@Autowired
	ProductService productService;
	@Autowired
	CategoryService categoryService;



	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("products", productService.allProducts());
		model.addAttribute("categories", categoryService.allCategorys());
		return "Home";
	}

	@GetMapping("/products/new")
    public String productsnew(@ModelAttribute Product product) {
		return "newproduct";
	}
	@GetMapping("/categories/new")
    public String categoriesnew(@ModelAttribute Category category) {
		return "newcategory";
	}
	
	@GetMapping("/products/{id}")
    public String productsshow(@PathVariable Long id,Model model) {
		Product product = productService.findProduct(id);
		model.addAttribute("product"  , product);
		model.addAttribute("unassigned", categoryService.getCategoriesByNotContain(product));
		return "showproduct";
	}
	
	@GetMapping("/categories/{id}")
    public String categoriesshow(@PathVariable Long id,Model model) {
		Category category = categoryService.findCategory(id);
		model.addAttribute("category"  , category);
		model.addAttribute("unassigned", productService.getProductsByNotContain(category));
		return "showcategory";
	}
	
	
	@PostMapping("/categories")
	public String create(@Valid @ModelAttribute Category category, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newcategory";
		}
		categoryService.createCategory(category);
		return "redirect:/categories/"+category.getId();
	} 
	
	@PostMapping("/products")
	public String create(@Valid @ModelAttribute Product product, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "newproduct";
		}
		productService.createProduct(product);
		return "redirect:/products/" + product.getId();
	} 
	
	@PostMapping("/categories/{id}/addProduct")
	public String addProduct(@RequestParam Long productId,@PathVariable("id") Long categoryId) {
		Category category = categoryService.findCategory(categoryId);
		Product product = productService.findProduct(productId);
		
		categoryService.addProduct(category, product);
		
		return "redirect:/categories/" + category.getId();
	}
	
	@PostMapping("/products/{id}/addCategory")
	public String addCategory(@PathVariable("id") Long productId,@RequestParam Long categoryId) {
		Category category = categoryService.findCategory(categoryId);
		Product product = productService.findProduct(productId);
		
		productService.addCategory(category, product);
		
		return "redirect:/products/" + product.getId();
	}
	
	
	
}