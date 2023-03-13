package com.programming.techie.consumerservice.service;

import com.programming.techie.consumerservice.dto.ConsumerRequest;
import com.programming.techie.consumerservice.dto.ConsumerResponse;
import com.programming.techie.consumerservice.model.Consumer;
import com.programming.techie.consumerservice.repository.ConsumerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class ConsumerService {
    private final ConsumerRepository consumerRepository;

    public void createConsumer(ConsumerRequest consumerRequest) {
        Consumer consumer = Consumer.builder()
                .name(consumerRequest.getName())
                .address(consumerRequest.getAddress())
                .phone(consumerRequest.getPhone())
                .build();

        consumerRepository.save(consumer);
        log.info("Consumer {} is saved", consumer.getId());
    }

    public List<ConsumerResponse> getAllConsumers() {
        List<Consumer> consumers = consumerRepository.findAll();

        return  consumers.stream().map(this::mapToConsumerResponse).toList();
    }

    private ConsumerResponse mapToConsumerResponse(Consumer consumer) {
        return ConsumerResponse.builder()
                .id(consumer.getId())
                .name(consumer.getName())
                .address(consumer.getAddress())
                .phone(consumer.getPhone())
                .build();
    }
}
