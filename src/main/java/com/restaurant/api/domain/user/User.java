package com.restaurant.api.domain.user;

import com.restaurant.api.domain.BaseEntity;
import com.restaurant.api.enums.UseYN;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.EnumType.STRING;
import static javax.persistence.GenerationType.IDENTITY;

/**
 * packageName : com.restaurant.api.domain.user
 * className : User
 * user : jwlee
 * date : 2023/02/25
 * description :
 */
@Getter
@NoArgsConstructor
@Table(name = "users")
@Entity
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(length = 20)
    private Long userNo;

    @Column(nullable = false, length = 20)
    private String userId;

    @Column(nullable = false, length = 20)
    private String password;

    @Enumerated(STRING)
    @Column(nullable = false)
    private UseYN useYn;

    @Builder
    public User(String userId, String password) {
        this.userId = userId;
        this.password = password;
        this.useYn = UseYN.YES;
    }


}
