package com.restaurant.api.controller;

import com.restaurant.api.dto.login.LoginReqDto;
import com.restaurant.api.dto.login.LogoutReqDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : com.restaurant.api.controller
 * className : LoginController
 * user : jwlee
 * date : 2023/01/16
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/login")
    public ResponseEntity<LoginReqDto> login(@RequestBody LoginReqDto loginReqDto){
        System.out.println(loginReqDto);
        return ResponseEntity.status(HttpStatus.OK).body(loginReqDto);
    }

    @PostMapping("/logout")
    public ResponseEntity<LogoutReqDto> logout(@RequestBody LogoutReqDto logoutReqDto){
        System.out.println(logoutReqDto);
        return ResponseEntity.status(HttpStatus.OK).body(logoutReqDto);
    }

}
