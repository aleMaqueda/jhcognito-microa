package com.example.microservices.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.microservices.web.rest.TestUtil;

public class InvoiceDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(InvoiceDTO.class);
        InvoiceDTO invoiceDTO1 = new InvoiceDTO();
        invoiceDTO1.setId("id1");
        InvoiceDTO invoiceDTO2 = new InvoiceDTO();
        assertThat(invoiceDTO1).isNotEqualTo(invoiceDTO2);
        invoiceDTO2.setId(invoiceDTO1.getId());
        assertThat(invoiceDTO1).isEqualTo(invoiceDTO2);
        invoiceDTO2.setId("id2");
        assertThat(invoiceDTO1).isNotEqualTo(invoiceDTO2);
        invoiceDTO1.setId(null);
        assertThat(invoiceDTO1).isNotEqualTo(invoiceDTO2);
    }
}
