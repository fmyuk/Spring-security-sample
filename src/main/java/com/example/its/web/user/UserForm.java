package com.example.its.web.user;

import com.example.its.web.validation.UniqueUsername;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@RequiredArgsConstructor
public class UserForm {

    @NotBlank
    @UniqueUsername
    private String username;

    @NotBlank
    private String password;
}
