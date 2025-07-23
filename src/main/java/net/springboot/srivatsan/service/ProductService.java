package net.springboot.srivatsan.service;

import java.util.List;

import net.springboot.srivatsan.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
