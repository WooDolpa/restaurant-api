package com.restaurant.api.dto.store;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
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
    @ApiModelProperty(notes = "사용자 ID", example = "1", required = true)
    private long userId;
    @ApiModelProperty(notes = "가게명", example = "똑순이 가게", required = true)
    private String storeName;

}
