package com.tt1.test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RepositorioTest {

    private Repositorio repositorio;
    private ToDo todo;

    @BeforeEach
    void setUp() {
        todo = new ToDo("Tarea1", "Desc", "2025-06-01");
        repositorio = new Repositorio(new DBStub());
    }

    @AfterEach
    void tearDown() {
        repositorio = null;
    }

    @Test
    void testGuardarYEncontrarTodo() {
        repositorio.guardarTodo(todo);
        assertEquals(todo, repositorio.encontrarTodo("Tarea1"));
    }
}