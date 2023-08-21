package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.enums.TourSeasonEnum;
import com.allianz.tourmanagement.model.enums.TourTypeEnum;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import jakarta.persistence.criteria.Order;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
public class TourEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "departing_city_id")
    private CityEntity departingCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "arriving_city_id")
    private CityEntity arrivingCity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "returning_city_id")
    private CityEntity returningCity;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private BigDecimal price;

    @Column
    private int capacity;

    @Enumerated(EnumType.STRING)
    private TourSeasonEnum tourSeason;

    @Enumerated(EnumType.STRING)
    private TourTypeEnum tourType;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "tour_stop",
            joinColumns = @JoinColumn(name = "tour_id"),
            inverseJoinColumns = @JoinColumn(name = "stop_id")
    )
    private List<StopEntity> stopList;

    @OneToMany(mappedBy = "tour", fetch = FetchType.LAZY)
    private List<OrderEntity> orderList;

}
