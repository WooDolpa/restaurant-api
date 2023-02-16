package com.restaurant.api.controller;

import com.restaurant.api.dto.store.AddStoreReqDto;
import com.restaurant.api.dto.store.UpdateStoreReqDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName : com.restaurant.api.dto.store
 * className : StoreController
 * user : jwlee
 * date : 2023/01/16
 */
@Api(tags = {"상점"})
@RestController
@RequestMapping("/store")
public class StoreController {


    @PostMapping("/add")
    @ApiOperation(value = "상점 등록")
    public ResponseEntity<AddStoreReqDto> addStore(@RequestBody AddStoreReqDto addStoreReqDto){
        return ResponseEntity.status(HttpStatus.OK).body(addStoreReqDto);
    }

    // 조회
    @GetMapping("/get/{store_id}")
    public Integer getStore(@PathVariable(name = "store_id") Integer storeId){
        return storeId;
    }

    // 수정
    @PutMapping("/update")
    public ResponseEntity<UpdateStoreReqDto> updateStore(@RequestBody UpdateStoreReqDto updateStoreReqDto){
        System.out.println(updateStoreReqDto);
        return ResponseEntity.status(HttpStatus.OK).body(updateStoreReqDto);
    }

    // 삭제
    @DeleteMapping("/delete/{store_id}")
    public Integer deleteStore(@PathVariable(name = "store_id") Integer storeId){
        return storeId;
    }

}
