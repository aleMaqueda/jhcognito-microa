package com.example.microservices.service;

import com.example.microservices.service.dto.ShipmentDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.example.microservices.domain.Shipment}.
 */
public interface ShipmentService {

    /**
     * Save a shipment.
     *
     * @param shipmentDTO the entity to save.
     * @return the persisted entity.
     */
    ShipmentDTO save(ShipmentDTO shipmentDTO);

    /**
     * Get all the shipments.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<ShipmentDTO> findAll(Pageable pageable);


    /**
     * Get the "id" shipment.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<ShipmentDTO> findOne(String id);

    /**
     * Delete the "id" shipment.
     *
     * @param id the id of the entity.
     */
    void delete(String id);
}
