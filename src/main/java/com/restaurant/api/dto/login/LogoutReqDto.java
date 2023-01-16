package com.restaurant.api.dto.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.login
 * className : LogoutReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@NoArgsConstructor
@Getter
@ToString
public class LogoutReqDto {

    private String token;
}
