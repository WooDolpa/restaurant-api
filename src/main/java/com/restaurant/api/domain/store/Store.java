package com.restaurant.api.domain.store;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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
public class Store {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Builder
    public Store(Long id) {
        this.id = id;
    }
}
