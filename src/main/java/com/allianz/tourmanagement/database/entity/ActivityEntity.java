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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "activity_stop",
            joinColumns = @JoinColumn(name = "activity_id"),
            inverseJoinColumns = @JoinColumn(name = "stop_id")
    )
    private List<StopEntity> stopList;

    @Enumerated(EnumType.STRING)
    private List<ActivityTypeEnum> activityTypeList;
}
