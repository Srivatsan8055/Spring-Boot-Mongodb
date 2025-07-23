package net.springboot.srivatsan.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.springboot.srivatsan.model.Product;

public interface ProductRepository extends MongoRepository<Product, Long>{

}
