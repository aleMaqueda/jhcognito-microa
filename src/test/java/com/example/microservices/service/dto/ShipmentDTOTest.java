package com.example.microservices.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.microservices.web.rest.TestUtil;

public class ShipmentDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(ShipmentDTO.class);
        ShipmentDTO shipmentDTO1 = new ShipmentDTO();
        shipmentDTO1.setId("id1");
        ShipmentDTO shipmentDTO2 = new ShipmentDTO();
        assertThat(shipmentDTO1).isNotEqualTo(shipmentDTO2);
        shipmentDTO2.setId(shipmentDTO1.getId());
        assertThat(shipmentDTO1).isEqualTo(shipmentDTO2);
        shipmentDTO2.setId("id2");
        assertThat(shipmentDTO1).isNotEqualTo(shipmentDTO2);
        shipmentDTO1.setId(null);
        assertThat(shipmentDTO1).isNotEqualTo(shipmentDTO2);
    }
}
