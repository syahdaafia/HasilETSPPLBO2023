package com.programming.techie.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class DeliveryResponse {
    private String id;
    private String courier;
    private String plat;
    private String status;
}
