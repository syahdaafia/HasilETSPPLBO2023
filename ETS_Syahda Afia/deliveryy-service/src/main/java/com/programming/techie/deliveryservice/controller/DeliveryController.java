package com.programming.techie.deliveryservice.controller;

import com.programming.techie.deliveryservice.dto.DeliveryRequest;
import com.programming.techie.deliveryservice.dto.DeliveryResponse;
import com.programming.techie.deliveryservice.service.DeliveryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
@RequiredArgsConstructor

public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDelivery(@RequestBody DeliveryRequest deliveryRequest) {
        deliveryService.createDelivery(deliveryRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<DeliveryResponse> getAllDeliveries() {
        return deliveryService.getAllDeliveries();
    }

}
