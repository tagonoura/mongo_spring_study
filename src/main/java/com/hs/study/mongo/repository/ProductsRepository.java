package com.hs.study.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.study.mongo.domain.Products;

public interface ProductsRepository extends MongoRepository<Products, String> {

  Products findByProductCode(String productCode);

  Iterable<Products> findByProductNameLike(String productName);

}
