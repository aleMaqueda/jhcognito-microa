package com.example.microservices.service.dto;

import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;
import com.example.microservices.domain.enumeration.NotificationType;

/**
 * A DTO for the {@link com.example.microservices.domain.Notification} entity.
 */
public class NotificationDTO implements Serializable {
    
    private String id;

    @NotNull
    private Instant date;

    private String details;

    @NotNull
    private Instant sentDate;

    @NotNull
    private NotificationType format;

    @NotNull
    private Long userId;

    @NotNull
    private Long productId;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Instant getSentDate() {
        return sentDate;
    }

    public void setSentDate(Instant sentDate) {
        this.sentDate = sentDate;
    }

    public NotificationType getFormat() {
        return format;
    }

    public void setFormat(NotificationType format) {
        this.format = format;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotificationDTO)) {
            return false;
        }

        return id != null && id.equals(((NotificationDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "NotificationDTO{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", details='" + getDetails() + "'" +
            ", sentDate='" + getSentDate() + "'" +
            ", format='" + getFormat() + "'" +
            ", userId=" + getUserId() +
            ", productId=" + getProductId() +
            "}";
    }
}
