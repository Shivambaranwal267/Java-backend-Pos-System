package com.codebridge.controller;

import com.codebridge.payload.dto.UserDto;
import com.codebridge.payload.response.AuthResponse;
import com.codebridge.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    private ResponseEntity<AuthResponse> signupHandler(
            @RequestBody UserDto userDto) throws Exception {
        return ResponseEntity.ok(authService.signup(userDto));

    }

    @PostMapping("/login")
    private ResponseEntity<AuthResponse> loginHandler(
            @RequestBody UserDto userDto) throws Exception {
        return ResponseEntity.ok(authService.login(userDto));

    }



}
