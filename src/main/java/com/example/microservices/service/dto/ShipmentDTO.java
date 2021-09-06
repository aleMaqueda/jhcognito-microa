package com.example.microservices.service.dto;

import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;

/**
 * A DTO for the {@link com.example.microservices.domain.Shipment} entity.
 */
public class ShipmentDTO implements Serializable {
    
    private String id;

    private String trackingCode;

    @NotNull
    private Instant date;

    private String details;


    private String invoiceId;

    private String invoiceCode;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTrackingCode() {
        return trackingCode;
    }

    public void setTrackingCode(String trackingCode) {
        this.trackingCode = trackingCode;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShipmentDTO)) {
            return false;
        }

        return id != null && id.equals(((ShipmentDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "ShipmentDTO{" +
            "id=" + getId() +
            ", trackingCode='" + getTrackingCode() + "'" +
            ", date='" + getDate() + "'" +
            ", details='" + getDetails() + "'" +
            ", invoiceId='" + getInvoiceId() + "'" +
            ", invoiceCode='" + getInvoiceCode() + "'" +
            "}";
    }
}
