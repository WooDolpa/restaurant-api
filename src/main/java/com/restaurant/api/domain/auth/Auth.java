package com.restaurant.api.domain.auth;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * packageName : com.restaurant.api.domain.auth
 * className : Auth
 * user : jwlee
 * date : 2023/02/04
 */
@Getter
@NoArgsConstructor
@Entity
public class Auth {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Builder
    public Auth(Long id, String password) {
        this.id = id;
        this.password = password;
    }
}
