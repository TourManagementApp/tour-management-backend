package com.allianz.tourmanagement.database.entity;

import com.allianz.tourmanagement.model.enums.ActivityTypeEnum;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Table
@Entity
@Data
public class ActivityEntity extends BaseEntity {
    @Column
    private String name;
    @Enumerated(EnumType.STRING)
    private List<ActivityTypeEnum> activityTypeList;
}
