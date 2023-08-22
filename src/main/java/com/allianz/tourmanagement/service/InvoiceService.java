package com.allianz.tourmanagement.service;

import com.allianz.tourmanagement.database.entity.InvoiceEntity;
import com.allianz.tourmanagement.database.repository.InvoiceRepository;
import com.allianz.tourmanagement.mapper.InvoiceMapper;
import com.allianz.tourmanagement.model.InvoiceDTO;
import com.allianz.tourmanagement.model.requestDTO.InvoiceRequestDTO;
import com.allianz.tourmanagement.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService extends BaseService<InvoiceEntity,
        InvoiceDTO,
        InvoiceRequestDTO,
        InvoiceMapper,
        InvoiceRepository> {
    @Autowired
    InvoiceMapper invoiceMapper;
    @Autowired
    InvoiceRepository invoiceRepository;

    @Override
    protected InvoiceMapper getMapper() {
        return invoiceMapper;
    }

    @Override
    protected InvoiceRepository getRepository() {
        return invoiceRepository;
    }
}
