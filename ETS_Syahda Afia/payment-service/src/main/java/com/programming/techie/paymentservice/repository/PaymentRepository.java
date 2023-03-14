package com.programming.techie.paymentservice.repository;

import com.programming.techie.paymentservice.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String>{
}
