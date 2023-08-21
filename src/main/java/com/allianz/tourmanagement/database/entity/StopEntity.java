package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.ActivityDTO;
import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.model.HotelDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Entity
@Table
@Data
public class StopEntity extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @Column
    private Date arrivalDate;

    @Column
    private Date departureDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hotel_id")
    private HotelEntity hotel;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "stopList")
    private List<ActivityEntity> activityList;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "stopList")
    private List<TourEntity> tourList;

}
