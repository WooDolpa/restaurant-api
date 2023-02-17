package com.restaurant.api.controller;

import com.restaurant.api.dto.user.UserReqDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : com.restaurant.api.controller
 * className : UserController
 * user : jwlee
 * date : 2023/02/15
 * description :
 */
@Tag(name = "User", description = "사용자")
@RestController
@RequestMapping("/user")
public class UserController {

    @Tag(name = "User")
    @ApiOperation(value = "사용자 등록", notes = "테스트입니다.<br>이렇게하면 줄바꿈이 되는가?")
    @PostMapping("/add")
    public ResponseEntity userAdd(@RequestBody UserReqDto dto){
        return ResponseEntity.ok().body("ok");
    }
}
