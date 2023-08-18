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
    @OneToOne
    private CityEntity city;
    @Column
    private Date arrivalDate;
    @Column
    private Date departureDate;
    @OneToOne
    private HotelEntity hotel;
    @OneToMany
    private List<ActivityEntity> activityList;
}
