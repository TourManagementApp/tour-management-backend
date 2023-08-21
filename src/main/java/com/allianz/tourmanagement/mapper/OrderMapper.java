package com.allianz.tourmanagement.mapper;

import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.model.OrderDTO;
import com.allianz.tourmanagement.model.requestDTO.OrderRequestDTO;
import com.allianz.tourmanagement.util.IBaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrderMapper extends IBaseMapper<OrderEntity, OrderDTO, OrderRequestDTO> {
}
