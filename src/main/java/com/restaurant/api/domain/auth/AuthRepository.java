package com.restaurant.api.domain.auth;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : com.restaurant.api.domain.auth
 * className : AuthRepository
 * user : jwlee
 * date : 2023/02/04
 */
public interface AuthRepository extends JpaRepository<Auth, Long> {
}
