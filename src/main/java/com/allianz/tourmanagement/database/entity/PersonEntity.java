package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.enums.PersonTypeEnum;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Entity
@Table
@Data
@EqualsAndHashCode(of = {"name", "surname", "birthDate", "identityNumber"})
public class PersonEntity extends BaseEntity {

    @Column
    private String name;

    @Column
    private String surname;

    @Column
    private Date birthDate;

    @Column(unique = true)
    private int identityNumber;

    @Enumerated(EnumType.STRING)
    private PersonTypeEnum personType;
}
