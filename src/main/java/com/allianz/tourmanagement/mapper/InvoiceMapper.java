package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.model.InvoiceDTO;
import com.allianz.tourmanagement.util.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper extends BaseMapper<InvoiceEntity, InvoiceDTO> {
}
