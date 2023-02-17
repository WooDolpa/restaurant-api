package com.restaurant.api.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * packageName : com.restaurant.api.domain
 * className : BaseEntity
 * user : jwlee
 * date : 2023/02/15
 * description :
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {

    @CreatedDate
    @Column(name = "reg_datetime")
    private LocalDateTime regDatetime;

    @LastModifiedDate
    @Column(name = "upd_datetime")
    private LocalDateTime updDatetime;
}
