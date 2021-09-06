package com.example.microservices.service.mapper;


import com.example.microservices.domain.*;
import com.example.microservices.service.dto.InvoiceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Invoice} and its DTO {@link InvoiceDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface InvoiceMapper extends EntityMapper<InvoiceDTO, Invoice> {


    @Mapping(target = "shipments", ignore = true)
    @Mapping(target = "removeShipment", ignore = true)
    Invoice toEntity(InvoiceDTO invoiceDTO);

    default Invoice fromId(String id) {
        if (id == null) {
            return null;
        }
        Invoice invoice = new Invoice();
        invoice.setId(id);
        return invoice;
    }
}
