package com.hs.study.mongo.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.study.mongo.domain.OrderDetails;

public interface OrderDetailsRepository extends MongoRepository<OrderDetails, String> {

  OrderDetails findByOrderNumberAndProductCode(Long orderNumber, String prodctCode);

  Iterable<OrderDetails> findByOrderNumber(Long orderNumber, Sort sort);

  Iterable<OrderDetails> findByProductCode(String productCode, Sort sort);

}
