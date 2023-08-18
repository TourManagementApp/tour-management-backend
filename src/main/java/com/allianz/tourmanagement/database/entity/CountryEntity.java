package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Table
@Entity
@Data
public class CountryEntity extends BaseEntity {
    @Column
    private String name;
}
