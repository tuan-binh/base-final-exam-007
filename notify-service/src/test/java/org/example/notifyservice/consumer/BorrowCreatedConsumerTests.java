package org.example.notifyservice.consumer;

import org.example.notifyservice.service.EmailService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BorrowCreatedConsumerTests {

    @Test
    void delegatesMessageToEmailService() {
        EmailService emailService = mock(EmailService.class);
        BorrowCreatedConsumer consumer = new BorrowCreatedConsumer(emailService);

        consumer.consume("customer@example.com");

        verify(emailService).sendBorrowCreatedEmail("customer@example.com");
    }
}
