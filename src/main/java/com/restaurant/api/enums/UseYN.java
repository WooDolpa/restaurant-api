package com.restaurant.api.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * packageName : com.restaurant.api.enums
 * className : DataStatus
 * user : jwlee
 * date : 2023/02/15
 * description : 데이터 상태
 */
@Getter
@RequiredArgsConstructor
public enum UseYN {

    YES("1", "사용"),
    NO("2", "미사용")
    ;

    private final String key;
    private final String name;
}
