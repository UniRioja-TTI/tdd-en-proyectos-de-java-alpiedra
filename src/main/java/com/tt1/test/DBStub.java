package com.tt1.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBStub {

    private Map<String, ToDo> tareas = new HashMap<>();
    private List<String> emails = new ArrayList<>();

    public boolean crearTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo buscarTodo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> getTodos() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean actualizarTodo(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean eliminarTodo(String nombre) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public boolean añadirEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<String> getEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}