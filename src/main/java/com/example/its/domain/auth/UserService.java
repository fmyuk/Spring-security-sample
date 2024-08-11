package com.example.its.domain.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @PreAuthorize("hasAuthority('ADMIN')")
    public List<User> findAll() {
        return repository.findAll();
    }

    @PreAuthorize("hasAuthority('ADMIN')")
    public void create(String username, String password, String authority) {
        String encodedPassword = passwordEncoder.encode(password);
        repository.insert(username, encodedPassword, authority);
    }
}
