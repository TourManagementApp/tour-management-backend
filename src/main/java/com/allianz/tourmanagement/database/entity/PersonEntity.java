package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;
@Entity
@Table
@Data
public class PersonEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private Date birthDate;
    @Column(unique = true)
    private int identityNumber;
}
