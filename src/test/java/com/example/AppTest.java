package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppTest {

    @Test
    @DisplayName("Should return the expected greeting message")
    void testGetMessage() {
        App app = new App();
        String message = app.getMessage();

        assertNotNull(message, "Message should not be null");
        assertEquals("Hello from Jenkins Maven CI!", message, "Message content must match expected output");
    }

    @Test
    @DisplayName("Main method runs without errors")
    void testMain() {
        App.main(new String[]{});
    }
}
