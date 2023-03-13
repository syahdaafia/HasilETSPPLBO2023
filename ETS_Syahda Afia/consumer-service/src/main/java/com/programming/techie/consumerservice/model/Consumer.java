package com.programming.techie.consumerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Document(value = "consumer")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class Consumer {
    @Id
    private String id;
    private String name;
    private String address;
    private String phone;
}
