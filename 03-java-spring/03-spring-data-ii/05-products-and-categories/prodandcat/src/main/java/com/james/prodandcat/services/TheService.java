package com.james.prodandcat.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.james.prodandcat.models.Category;
import com.james.prodandcat.models.Product;
import com.james.prodandcat.repositories.CategoryRepository;
import com.james.prodandcat.repositories.ProductRepository;

@Service
public class TheService {
	@Autowired
	private CategoryRepository cRepo;
	@Autowired 
	private ProductRepository pRepo;
	
	public Product createProduct(Product product) {
		return this.pRepo.save(product);
	}
	public Category createCategory(Category cat) {
			return this.cRepo.save(cat);
	}	
	public Category getSingleCat(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	public Product getSingleProd(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	public List<Category> findCatNotProd(Product product){
		return this.cRepo.findByPRoductsNotContains(product);
	}
	public List<Product> findProdNotCat(Category category){
		return this.pRepo.findByCategoriesNotContains(category);
	}
	public void addCategoryToProduct(Product product, Category category) {
		List<Category> existingCats = product.getCategories();
		existingCats.add(category);
		this.pRepo.save(product);
	}
	public void addProductToCategory(Product product, Category category) {
		List<Product> existingProds = category.getProducts();
		existingProds.add(product);
		this.cRepo.save(category);
	}

	

}
