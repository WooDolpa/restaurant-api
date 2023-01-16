package com.restaurant.api.dto.table;

import com.restaurant.api.dto.menu.Menu;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

/**
 * packageName : com.restaurant.api.dto.table
 * className : AddTableReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@Getter
@ToString
public class AddTableReqDto {

    private Integer storeId;
    private String name;
    private String dataStatus;

    public AddTableReqDto() {
        this.dataStatus = "1";
    }

    @Builder
    public AddTableReqDto(Integer storeId, String name, String dataStatus) {
        this.storeId = storeId;
        this.name = name;
        this.dataStatus = dataStatus;
    }
}
