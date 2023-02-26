package com.restaurant.api.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Column;

/**
 * packageName : com.restaurant.api.dto.user
 * className : UserReqDto
 * user : jwlee
 * date : 2023/02/15
 * description : 사용자 등록 요청 DTO
 */
@Getter
@ToString
@AllArgsConstructor
public class UserReqDto {

    @ApiModelProperty(notes = "사용하고자 하는 ID <br> 20자리까지 가능합니다.", example = "jwlee", required = true)
    @Column(length = 20)
    private String id;
    @ApiModelProperty(notes = "사용하고자 하는 비밀번호 <br> 20자리까지 가능합니다.", example = "1234", required = true)
    @Column(length = 20)
    private String password;

}
