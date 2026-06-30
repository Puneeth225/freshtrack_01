package com.freshtrack.warehouse.dto;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email;
    private String password;
}
