package com.programming.techie.consumerservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ConsumerRequest {
    private String name;
    private String address;
    private String phone;
}
