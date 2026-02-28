package com.tt1.test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MailerStubTest {

    private MailerStub mailer;

    @BeforeEach
    void setUp() {
        mailer = new MailerStub("user@test.com", "Tarea vencida!");
    }

    @AfterEach
    void tearDown() {
        mailer = null;
    }

    @Test
    void testEnviarMailDevuelveTrue() {
        assertTrue(mailer.enviarMail());
    }
}