package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.OrderEntity;
import com.allianz.tourmanagement.database.repository.OrderRepository;
import com.allianz.tourmanagement.mapper.OrderMapper;
import com.allianz.tourmanagement.model.OrderDTO;
import com.allianz.tourmanagement.model.requestDTO.OrderRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import com.allianz.tourmanagement.util.dbutil.BaseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService extends BaseService<OrderEntity, OrderDTO, OrderRequestDTO, OrderMapper, OrderRepository> {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    OrderRepository orderRepository;

    @Override
    protected OrderMapper getMapper() {
        return orderMapper;
    }
    @Override
    protected OrderRepository getRepository() {
        return orderRepository;
    }
}
