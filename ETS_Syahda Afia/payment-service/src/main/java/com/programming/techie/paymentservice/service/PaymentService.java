package com.programming.techie.paymentservice.service;

import com.programming.techie.paymentservice.dto.PaymentRequest;
import com.programming.techie.paymentservice.dto.PaymentResponse;
import com.programming.techie.paymentservice.model.Payment;
import com.programming.techie.paymentservice.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class PaymentService {
    private final PaymentRepository paymentRepository;

    public void createPayment(PaymentRequest paymentRequest) {
        Payment payment = Payment.builder()
                .method(paymentRequest.getMethod())
                .status(paymentRequest.getStatus())
                .build();

        paymentRepository.save(payment);
        log.info("Payment {} is saved", payment.getId());
    }

    public List<PaymentResponse> getAllPayment() {
        List<Payment> payments = paymentRepository.findAll();

        return  payments.stream().map(this::mapToPaymentResponse).toList();
    }

    private PaymentResponse mapToPaymentResponse(Payment payment) {
        return PaymentResponse.builder()
                .id(payment.getId())
                .method(payment.getMethod())
                .status(payment.getStatus())
                .build();
    }
}
