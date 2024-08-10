package com.example.its.domain.auth;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private String username;
    private String password;
}
