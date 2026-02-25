package com.tt1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {

    private ToDo todo;

    @BeforeEach
    void setUp() {
        todo = new ToDo("Estudiar", "Repasar apuntes", "2025-06-01");
    }

    @AfterEach
    void tearDown() {
        todo = null;
    }

    @Test
    void testNombreCorecto() {
        assertEquals("Estudiar", todo.getNombre());
    }

    @Test
    void testCompletadoFalsePorDefecto() {
        assertFalse(todo.getCompletado());
    }
}