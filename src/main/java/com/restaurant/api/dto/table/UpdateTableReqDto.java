package com.restaurant.api.dto.table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.table
 * className : UpdateTableReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@NoArgsConstructor
@Getter
@ToString
public class UpdateTableReqDto {

    private Integer tableId;
    private Integer storeId;
    private String name;
    private String dataStatus;

    @Builder
    public UpdateTableReqDto(Integer tableId, Integer storeId, String name, String dataStatus) {
        this.tableId = tableId;
        this.storeId = storeId;
        this.name = name;
        this.dataStatus = dataStatus;
    }
}
