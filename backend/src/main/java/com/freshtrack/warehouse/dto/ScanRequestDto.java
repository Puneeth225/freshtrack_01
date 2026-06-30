package com.freshtrack.warehouse.dto;

import lombok.Data;

@Data
public class ScanRequestDto {
    private String invoiceId;
    private String sku;
    private Long userId;
}
