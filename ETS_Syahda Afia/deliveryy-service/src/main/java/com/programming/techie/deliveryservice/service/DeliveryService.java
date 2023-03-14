package com.programming.techie.deliveryservice.service;

import com.programming.techie.deliveryservice.dto.DeliveryRequest;
import com.programming.techie.deliveryservice.dto.DeliveryResponse;
import com.programming.techie.deliveryservice.model.Delivery;
import com.programming.techie.deliveryservice.repository.DeliveryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j

public class DeliveryService {
    private final DeliveryRepository deliveryRepository;

    public void createDelivery(DeliveryRequest deliveryRequest) {
        Delivery delivery = Delivery.builder()
                .courier(deliveryRequest.getCourier())
                .eta(deliveryRequest.getEta())
                .plat(deliveryRequest.getPlat())
                .status(deliveryRequest.getStatus())
                .build();

        deliveryRepository.save(delivery);
        log.info("Delivery {} is saved", delivery.getId());
    }

    public List<DeliveryResponse> getAllDeliveries() {
        List<Delivery> deliveries = deliveryRepository.findAll();

        return  deliveries.stream().map(this::mapToDeliveryResponse).toList();
    }

    private DeliveryResponse mapToDeliveryResponse(Delivery delivery) {
        return DeliveryResponse.builder()
                .id(delivery.getId())
                .courier(delivery.getCourier())
                .eta(delivery.getEta())
                .plat(delivery.getPlat())
                .status(delivery.getStatus())
                .build();
    }
}
