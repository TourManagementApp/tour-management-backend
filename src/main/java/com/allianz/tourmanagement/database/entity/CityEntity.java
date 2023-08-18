package com.allianz.tourmanagement.database.entity;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

@Table
@Entity
@Data
public class CityEntity extends BaseEntity {
    @Column
    private String name;
    @ManyToOne
    private CountryEntity countryEntity;
}
