package com.restaurant.api.dto.store;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.store
 * className : UpdateStoreReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@NoArgsConstructor
@ToString
@Getter
public class UpdateStoreReqDto {

    private Integer storeId;
    private String name;
    private String dataStatus;

    @Builder
    public UpdateStoreReqDto(Integer storeId, String name, String dataStatus) {
        this.storeId = storeId;
        this.name = name;
        this.dataStatus = dataStatus;
    }

}
