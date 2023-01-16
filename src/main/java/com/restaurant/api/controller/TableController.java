package com.restaurant.api.controller;

import com.restaurant.api.dto.table.AddTableReqDto;
import com.restaurant.api.dto.table.UpdateTableReqDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName : com.restaurant.api.controller
 * className : TableController
 * user : jwlee
 * date : 2023/01/16
 */
@RestController
@RequestMapping("/table")
public class TableController {

    //등록
    @PostMapping("/add")
    public ResponseEntity<AddTableReqDto> addTable(@RequestBody AddTableReqDto addTableReqDto){
        System.out.println(addTableReqDto);
        return ResponseEntity.status(HttpStatus.OK).body(addTableReqDto);
    }

    //조회
    @GetMapping("/get/list")
    public String getTableList(){
        return "OK";
    }

    //상세
    @GetMapping("/get/{table_id}")
    public String getTable(@PathVariable(name = "table_id") Integer tableId) {
        return "OK";
    }

    //수정
    @PutMapping("/update")
    public ResponseEntity<UpdateTableReqDto> updateTable(@RequestBody UpdateTableReqDto updateTableReqDto){
        System.out.println(updateTableReqDto);
        return ResponseEntity.status(HttpStatus.OK).body(updateTableReqDto);
    }

    //삭제
    @DeleteMapping("/delete/{table_id}")
    public String deleteTable(@PathVariable(name = "table_id") Integer tableId){
        System.out.println(tableId);
        return tableId + "";
    }

}
