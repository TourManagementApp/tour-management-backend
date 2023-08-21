package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.model.InvoiceDTO;
import com.allianz.tourmanagement.model.requestDTO.InvoiceRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InvoiceMapper extends IBaseMapper<InvoiceEntity, InvoiceDTO, InvoiceRequestDTO> {
}
