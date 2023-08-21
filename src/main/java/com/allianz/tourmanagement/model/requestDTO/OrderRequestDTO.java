package com.allianz.tourmanagement.model.requestDTO;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.model.enums.OrderStatusEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Data
public class OrderRequestDTO extends BaseDTO {

    private UserRequestDTO user;
    private OrderStatusEnum orderStatus;
    private TourRequestDTO tour;
    private Set<PersonRequestDTO> personList;
    private BigDecimal totalPrice;
    private InvoiceEntity invoice;

}
