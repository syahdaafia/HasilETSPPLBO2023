package com.programming.techie.consumerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ConsumerResponse {
    private String id;
    private String name;
    private String address;
    private String phone;
}
