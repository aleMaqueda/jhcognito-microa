package com.example.microservices.service.dto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.microservices.web.rest.TestUtil;

public class NotificationDTOTest {

    @Test
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(NotificationDTO.class);
        NotificationDTO notificationDTO1 = new NotificationDTO();
        notificationDTO1.setId("id1");
        NotificationDTO notificationDTO2 = new NotificationDTO();
        assertThat(notificationDTO1).isNotEqualTo(notificationDTO2);
        notificationDTO2.setId(notificationDTO1.getId());
        assertThat(notificationDTO1).isEqualTo(notificationDTO2);
        notificationDTO2.setId("id2");
        assertThat(notificationDTO1).isNotEqualTo(notificationDTO2);
        notificationDTO1.setId(null);
        assertThat(notificationDTO1).isNotEqualTo(notificationDTO2);
    }
}
