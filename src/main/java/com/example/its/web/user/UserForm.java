package com.example.its.web.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class UserForm {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
