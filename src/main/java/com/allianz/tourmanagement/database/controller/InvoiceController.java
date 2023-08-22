package com.allianz.tourmanagement.database.controller;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.database.repository.InvoiceRepository;
import com.allianz.tourmanagement.mapper.InvoiceMapper;
import com.allianz.tourmanagement.model.InvoiceDTO;
import com.allianz.tourmanagement.model.requestDTO.InvoiceRequestDTO;
import com.allianz.tourmanagement.service.InvoiceService;
import com.allianz.tourmanagement.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController extends BaseController<InvoiceEntity,
        InvoiceDTO,
        InvoiceRequestDTO,
        InvoiceMapper,
        InvoiceRepository,
        InvoiceService> {
    @Autowired
    InvoiceService invoiceService;

    @Override
    protected InvoiceService getService() {
        return invoiceService;
    }
}
