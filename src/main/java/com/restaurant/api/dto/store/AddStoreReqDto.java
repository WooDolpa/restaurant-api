package com.restaurant.api.dto.store;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.store
 * className : AddStoreReqDto
 * user : jwlee
 * date : 2023/01/16
 */
@Getter
@ToString
@Builder
public class AddStoreReqDto {

    private long userId;
    private String name;
    private String dataStatus;

    public AddStoreReqDto() {
        this.dataStatus = "1";
    }
    @Builder
    public AddStoreReqDto(long userId, String name, String dataStatus) {
        this.userId = userId;
        this.name = name;
        this.dataStatus = dataStatus;
    }
}
