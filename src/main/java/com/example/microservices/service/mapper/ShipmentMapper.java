package com.example.microservices.service.mapper;


import com.example.microservices.domain.*;
import com.example.microservices.service.dto.ShipmentDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Shipment} and its DTO {@link ShipmentDTO}.
 */
@Mapper(componentModel = "spring", uses = {InvoiceMapper.class})
public interface ShipmentMapper extends EntityMapper<ShipmentDTO, Shipment> {

    @Mapping(source = "invoice.id", target = "invoiceId")
    @Mapping(source = "invoice.code", target = "invoiceCode")
    ShipmentDTO toDto(Shipment shipment);

    @Mapping(source = "invoiceId", target = "invoice")
    Shipment toEntity(ShipmentDTO shipmentDTO);

    default Shipment fromId(String id) {
        if (id == null) {
            return null;
        }
        Shipment shipment = new Shipment();
        shipment.setId(id);
        return shipment;
    }
}
