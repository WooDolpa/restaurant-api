package com.restaurant.api.dto.login;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.login
 * className : LoginReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@NoArgsConstructor
@Getter
@ToString
public class LoginReqDto {

    private String id;
    private String password;

}
