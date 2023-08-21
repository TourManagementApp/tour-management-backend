package com.allianz.tourmanagement.model;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.model.enums.OrderStatusEnum;
import com.allianz.tourmanagement.util.BaseDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


@Data
public class OrderDTO extends BaseDTO {

    private UserDTO user;
    private OrderStatusEnum orderStatus;
    private TourDTO tour;
    @JsonIgnore
    private Set<PersonDTO> personList;
    private BigDecimal totalPrice;
    private InvoiceEntity invoice;

}
