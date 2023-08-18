package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.PersonDTO;
import com.allianz.tourmanagement.model.TourDTO;
import com.allianz.tourmanagement.model.UserDTO;
import com.allianz.tourmanagement.model.enums.OrderStatusEnum;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.sql.results.graph.Fetch;

import java.math.BigDecimal;
import java.util.List;
@Entity
@Table
@Data
public class OrderEntity extends BaseEntity {
    @ManyToOne
    private UserEntity userEntity;
    @Enumerated(EnumType.STRING)
    private OrderStatusEnum orderStatus;
    @OneToOne
    private TourEntity tourEntity;
    @ManyToMany
    private List<PersonEntity> personList;
    @Column
    private BigDecimal totalPrice;
}
