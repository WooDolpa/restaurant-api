package com.restaurant.api.domain.store;

import com.restaurant.api.domain.BaseEntity;
import com.restaurant.api.enums.UseYN;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * packageName : com.restaurant.api.domain.store
 * className : Store
 * user : jwlee
 * date : 2023/02/05
 */
@Getter
@NoArgsConstructor
@Entity
public class Store extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "store_name", nullable = false, length = 20)
    private String storeName;
    @Enumerated(STRING)
    @Column(nullable = false)
    private UseYN useYn;

    public Store(String storeName) {
        this.storeName = storeName;
        this.useYn = UseYN.YES;
    }

}
