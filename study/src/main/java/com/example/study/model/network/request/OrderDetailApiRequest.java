package com.example.study.model.network.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderDetailApiRequest {

    private Long id;

    private String status;

    private LocalDateTime arrivalDate;

    private int quantity;

    private BigDecimal totalPrice;

    private Long orderGroupId;

    private Long itemId;
}
