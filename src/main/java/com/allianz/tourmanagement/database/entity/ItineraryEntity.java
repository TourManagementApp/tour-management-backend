package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.StopDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Table
@Data
public class ItineraryEntity extends BaseEntity {
    @Column
    private int stopNumber;
    @OneToMany
    private List<StopEntity> stopList;
}
