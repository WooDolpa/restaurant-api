package com.restaurant.api.domain.store;

import com.restaurant.api.domain.BaseEntity;
import com.restaurant.api.domain.user.User;
import com.restaurant.api.enums.UseYN;
import lombok.Builder;
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
    private Long storeId;
    @Column(name = "store_name", nullable = false, length = 20)
    private String storeName;
    @Enumerated(STRING)
    @Column(nullable = false)
    private UseYN useYn;

    @ManyToOne
    @JoinColumn(name = "userNo")
    private User user;

    @Builder
    public Store(String storeName, User user) {
        this.storeName = storeName;
        this.user = user;
        this.useYn = UseYN.YES;
    }

}
