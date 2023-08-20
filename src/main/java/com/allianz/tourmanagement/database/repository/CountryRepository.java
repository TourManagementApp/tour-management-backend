package com.allianz.tourmanagement.database.repository;

import com.allianz.tourmanagement.database.entity.CountryEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends IBaseRepository<CountryEntity> {
}
