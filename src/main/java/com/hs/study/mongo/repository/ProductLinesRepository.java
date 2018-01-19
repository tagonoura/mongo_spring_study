package com.hs.study.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.study.mongo.domain.ProductLines;

public interface ProductLinesRepository extends MongoRepository<ProductLines, String> {

  ProductLines findByProductLine(String productLine);

  Iterable<ProductLines> findByTextDescriptionLike(String name);

}
