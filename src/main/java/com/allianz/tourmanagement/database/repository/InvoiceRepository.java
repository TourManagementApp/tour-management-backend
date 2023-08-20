package com.allianz.tourmanagement.database.repository;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.util.dbutil.IBaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends IBaseRepository<InvoiceEntity> {
}
