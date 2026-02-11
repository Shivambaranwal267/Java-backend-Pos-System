package com.codebridge.service;

import com.codebridge.exception.UserException;
import com.codebridge.payload.dto.UserDto;
import com.codebridge.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;

}
