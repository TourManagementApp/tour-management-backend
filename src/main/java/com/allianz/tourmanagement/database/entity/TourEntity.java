package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.model.ItineraryDTO;
import com.allianz.tourmanagement.model.enums.TourSeasonEnum;
import com.allianz.tourmanagement.model.enums.TourTypeEnum;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table
@Data
public class TourEntity extends BaseEntity {
    @OneToOne
    private CityEntity departingCity;
    @OneToOne
    private CityEntity arrivingCity;
    @OneToOne
    private CityEntity returningCity;
    @Column
    private Date starDate;
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
    @OneToOne
    private ItineraryEntity itineraryEntity;
}
