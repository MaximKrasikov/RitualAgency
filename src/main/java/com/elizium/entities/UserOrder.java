package com.elizium.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name= "user_order")
public class UserOrder {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "USER_ORDER_SEQ_GENERATOR")
    @SequenceGenerator(name = "USER_ORDER_SEQ_GENERATOR", sequenceName = "USER_ORDER_SEQ", allocationSize = 10)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @CreatedDate
    @Column(name = "date_created")
    private Date created;

    @LastModifiedDate
    @Column(name = "date_updated")
    private Date updated;
}
