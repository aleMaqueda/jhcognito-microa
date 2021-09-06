package com.example.microservices.service.impl;

import com.example.microservices.service.ShipmentService;
import com.example.microservices.domain.Shipment;
import com.example.microservices.repository.ShipmentRepository;
import com.example.microservices.service.dto.ShipmentDTO;
import com.example.microservices.service.mapper.ShipmentMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Shipment}.
 */
@Service
public class ShipmentServiceImpl implements ShipmentService {

    private final Logger log = LoggerFactory.getLogger(ShipmentServiceImpl.class);

    private final ShipmentRepository shipmentRepository;

    private final ShipmentMapper shipmentMapper;

    public ShipmentServiceImpl(ShipmentRepository shipmentRepository, ShipmentMapper shipmentMapper) {
        this.shipmentRepository = shipmentRepository;
        this.shipmentMapper = shipmentMapper;
    }

    @Override
    public ShipmentDTO save(ShipmentDTO shipmentDTO) {
        log.debug("Request to save Shipment : {}", shipmentDTO);
        Shipment shipment = shipmentMapper.toEntity(shipmentDTO);
        shipment = shipmentRepository.save(shipment);
        return shipmentMapper.toDto(shipment);
    }

    @Override
    public Page<ShipmentDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Shipments");
        return shipmentRepository.findAll(pageable)
            .map(shipmentMapper::toDto);
    }


    @Override
    public Optional<ShipmentDTO> findOne(String id) {
        log.debug("Request to get Shipment : {}", id);
        return shipmentRepository.findById(id)
            .map(shipmentMapper::toDto);
    }

    @Override
    public void delete(String id) {
        log.debug("Request to delete Shipment : {}", id);
        shipmentRepository.deleteById(id);
    }
}
