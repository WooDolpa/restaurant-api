package com.restaurant.api.dto.store;

import io.swagger.annotations.ApiModelProperty;
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
    private String storeName;

}
