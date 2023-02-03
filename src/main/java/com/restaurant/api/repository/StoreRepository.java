package com.restaurant.api.repository;

import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * packageName : com.restaurant.api.repository
 * className : StoreRepository
 * user : jwlee
 * date : 2023/02/01
 */
@Repository
@Entity
public interface StoreRepository {
    @Id
}
