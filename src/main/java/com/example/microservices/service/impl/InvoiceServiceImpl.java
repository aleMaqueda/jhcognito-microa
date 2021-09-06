package com.example.microservices.service.impl;

import com.example.microservices.service.InvoiceService;
import com.example.microservices.domain.Invoice;
import com.example.microservices.repository.InvoiceRepository;
import com.example.microservices.service.dto.InvoiceDTO;
import com.example.microservices.service.mapper.InvoiceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Invoice}.
 */
@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final Logger log = LoggerFactory.getLogger(InvoiceServiceImpl.class);

    private final InvoiceRepository invoiceRepository;

    private final InvoiceMapper invoiceMapper;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository, InvoiceMapper invoiceMapper) {
        this.invoiceRepository = invoiceRepository;
        this.invoiceMapper = invoiceMapper;
    }

    @Override
    public InvoiceDTO save(InvoiceDTO invoiceDTO) {
        log.debug("Request to save Invoice : {}", invoiceDTO);
        Invoice invoice = invoiceMapper.toEntity(invoiceDTO);
        invoice = invoiceRepository.save(invoice);
        return invoiceMapper.toDto(invoice);
    }

    @Override
    public Page<InvoiceDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Invoices");
        return invoiceRepository.findAll(pageable)
            .map(invoiceMapper::toDto);
    }


    @Override
    public Optional<InvoiceDTO> findOne(String id) {
        log.debug("Request to get Invoice : {}", id);
        return invoiceRepository.findById(id)
            .map(invoiceMapper::toDto);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete Invoice : {}", id);
        invoiceRepository.deleteById(id);
    }
}
