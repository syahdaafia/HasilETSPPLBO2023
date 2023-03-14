package com.programming.techie.deliveryservice.repository;

import com.programming.techie.deliveryservice.model.Delivery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeliveryRepository extends MongoRepository<Delivery, String>  {
}
