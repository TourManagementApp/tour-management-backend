package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.CountryDTO;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Entity
@Table(name="users")
@Data
public class UserEntity extends BaseEntity {
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private String email;
    @Column
    private Date birthDate;
    @Column
    private String cardNo;
    @OneToOne
    private CountryEntity countryEntity;
}
