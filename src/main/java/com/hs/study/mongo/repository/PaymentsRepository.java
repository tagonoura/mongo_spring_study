package com.hs.study.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hs.study.mongo.domain.Payments;

public interface PaymentsRepository extends MongoRepository<Payments, String> {

  Payments findByCustomerNumberAndCheckNumber(Long customerNumber, String checkNumber);

}
