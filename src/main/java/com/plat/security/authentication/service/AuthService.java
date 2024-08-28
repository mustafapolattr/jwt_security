package com.plat.security.authentication.service;


import com.plat.security.user.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public ResponseEntity<String> login(UserDTO userDTO) {
        // Kimlik doğrulama mantığı
        return ResponseEntity.ok("Login successful");
    }

    public ResponseEntity<String> register(UserDTO userDTO) {
        // Kullanıcı kaydı mantığı
        return ResponseEntity.ok("Registration successful");
    }


}
