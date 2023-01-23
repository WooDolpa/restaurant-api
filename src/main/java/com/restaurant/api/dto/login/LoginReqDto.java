package com.restaurant.api.dto.login;

/**
 * packageName : com.restaurant.api.dto.login
 * className : LoginReqDto
 * user : jwlee
 * date : 2023/01/16
 */
public class LoginReqDto {

    private String id;
    private String password;
    public LoginReqDto(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
