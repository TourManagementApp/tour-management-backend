package com.allianz.tourmanagement.database.repository;

import com.allianz.tourmanagement.database.entity.TourEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends IBaseRepository<TourEntity> {
}
