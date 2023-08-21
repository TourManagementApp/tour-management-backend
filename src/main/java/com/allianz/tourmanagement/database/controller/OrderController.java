package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.database.repository.OrderRepository;
import com.allianz.tourmanagement.mapper.OrderMapper;
import com.allianz.tourmanagement.model.OrderDTO;
import com.allianz.tourmanagement.model.requestDTO.OrderRequestDTO;
import com.allianz.tourmanagement.service.OrderService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController<
        OrderEntity,
        OrderDTO,
        OrderRequestDTO,
        OrderMapper,
        OrderRepository,
        OrderService> {
    @Autowired
    private OrderService orderService;

    @Override
    protected OrderService getService() {
        return orderService;
    }
}
