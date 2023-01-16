package com.restaurant.api.dto.menu;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * packageName : com.restaurant.api.dto.menu
 * className : Menu
 * user : jwlee
 * date : 2023/01/16
 */
@Getter
@ToString
public class Menu {

    private Integer storeId;
    private String name;
    private int price;
    private String dataStatus;

    public Menu() {
        this.dataStatus = "1";
    }

    @Builder
    public Menu(Integer storeId, String name, int price, String dataStatus) {
        this.storeId = storeId;
        this.name = name;
        this.price = price;
        this.dataStatus = dataStatus;
    }
}
