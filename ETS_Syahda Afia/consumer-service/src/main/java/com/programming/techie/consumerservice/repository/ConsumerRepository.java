package com.programming.techie.consumerservice.repository;

import com.programming.techie.consumerservice.model.Consumer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsumerRepository extends MongoRepository<Consumer, String> {
}
