package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.CityDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class HotelEntity extends BaseEntity {
    @Column
    private String name;
    @OneToOne
    private CityEntity cityEntity;
}
