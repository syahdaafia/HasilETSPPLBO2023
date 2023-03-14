package com.programming.techie.paymentservice.controller;

import com.programming.techie.paymentservice.dto.PaymentRequest;
import com.programming.techie.paymentservice.dto.PaymentResponse;
import com.programming.techie.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
@RequiredArgsConstructor

public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody PaymentRequest paymentRequest) {
        paymentService.createPayment(paymentRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PaymentResponse> getAllPayment() {
        return paymentService.getAllPayment();
    }
}
