package com.hs.study.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.study.mongo.domain.Orders;

public interface OrdersRepository extends MongoRepository<Orders, String> {

  Orders findByOrderNumber(Long orderNumber);

  Iterable<Orders> findByCustomerNumber(Long customerNumber);

}
