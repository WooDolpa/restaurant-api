package com.restaurant.api.dto.user;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
    private String id;
    @ApiModelProperty(value = "비밀번호", required = true)
    private String password;

}
