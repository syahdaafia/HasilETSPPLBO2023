package com.programming.techie.consumerservice.controller;

import com.programming.techie.consumerservice.dto.ConsumerRequest;
import com.programming.techie.consumerservice.dto.ConsumerResponse;
import com.programming.techie.consumerservice.service.ConsumerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/consumer")
@RequiredArgsConstructor

public class ConsumerController {

    private final ConsumerService consumerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createConsumer(@RequestBody ConsumerRequest consumerRequest) {
        consumerService.createConsumer(consumerRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ConsumerResponse> getAllConsumers() {
        return consumerService.getAllConsumers();
    }

}


