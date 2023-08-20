package com.allianz.tourmanagement.database.repository;

import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends IBaseRepository<OrderEntity> {
}
