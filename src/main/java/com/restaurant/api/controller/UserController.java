package com.restaurant.api.controller;

import com.restaurant.api.dto.user.UserReqDto;
import com.restaurant.api.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
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
@Slf4j
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @Tag(name = "User")
    @ApiResponses({
            @ApiResponse(code = 201, message = "등록성공"),
            @ApiResponse(code = 400, message = "등록실패")
    })
    @ApiOperation(value = "사용자 등록", notes = "사용자 등록")
    @PostMapping("/add")
    public ResponseEntity userAdd(@RequestBody UserReqDto dto){
        long result = userService.insert(dto);
        if(result > 0){
            return new ResponseEntity("등록완료!", HttpStatus.CREATED);
        }
        return new ResponseEntity("등록실패...", HttpStatus.BAD_REQUEST);
    }
}
